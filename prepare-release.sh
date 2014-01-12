set -e
timestamp=$(date +%Y%m%d%H%M)
echo "preparing release"
echo "release version:"
read version
#pick release BUILDQUALIFIER (eg, 20100924-1107) and update release branch to the release version
mvn -Dtycho.mode=maven org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=$version.$timestamp
  
#commit and tag your changes
git commit -s -a -m "new release $version"
git tag v$version
git push --tags  origin master

exit 1
