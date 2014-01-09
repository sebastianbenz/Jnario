set -e
timestamp=$(date +%Y%m%d%H%M)
echo "preparing release"
echo "release version:"
read version
echo "Releasing $version"

#prepare update site
cd ../jnario-gh-pages
git pull origin gh-pages
cd ../jnario

#run all tests
mvn clean verify

#create release branch
git branch rb-$version

#checkout the release branch
git checkout rb-$version

#pick release BUILDQUALIFIER (eg, 20100924-1107) and update release branch to the release version
mvn -Dtycho.mode=maven org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$version.$timestamp
  
#commit and tag your changes
git commit -s -a -m "new release $version"
git tag v$version
git push --tags  origin master

exit 1
