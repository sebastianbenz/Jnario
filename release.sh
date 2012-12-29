set -e

echo "release version:"
read version

#make the release build
mvn clean install -Dmaven.test.skip=true -P release 

#publish update site
cd ../jnario-gh-pages
git add --all
git commit -a -m "new release $version"
git push origin gh-pages
cd ../jnario

# upload to maven central 
URL="https://oss.sonatype.org/service/local/staging/deploy/maven2/"
REPO="sonatype-nexus-staging"

#todo: remove all snapshot dependencies
for project in "org.jnario.standalone.maven" "jnario-maven-plugin" "org.jnario.lib.maven" "jnario-maven-report-plugin"
do
cd plugins/$project
mvn versions:set -DnewVersion=$version -DgenerateBackupPoms=false
mvn clean install
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/$project-$version.jar
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/$project-$version-sources.jar -Dclassifier=sources
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/$project-$version-javadoc.jar -Dclassifier=javadoc
cd ../..
done

echo "Successfully staged maven artifacts. Manually close & release via https://oss.sonatype.org/index.html#stagingRepositories"

exit 1 