set -e
timestamp=$(date +%Y%m%d%H%M)
echo "preparing release"
echo "release version:"
read version
echo "next version:"
read nextversion
echo "Releasing $version"


#update tycho managed plugins
mvn -Dtycho.mode=maven org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$nextversion-SNAPSHOT

#update maven managed projects
for project in "org.jnario.standalone.maven" "jnario-maven-plugin" "org.jnario.lib.maven" 
do
cd plugins/$project
mvn versions:set -DnewVersion=$nextversion-SNAPSHOT -DgenerateBackupPoms=false
cd ../..
done

#commit and push to remote
git commit -s -a -m "new version $nextversion-SNAPSHOT"
git push

#checkout the release branch
git checkout rb-$version

#pick release BUILDQUALIFIER (eg, 20100924-1107) and update release branch to the release version
mvn -Dtycho.mode=maven org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$version.$timestamp
  
#commit and tag your changes
git commit -s -a -m "new release $version"
git tag v$version
git push --tags  origin master

exit 1
