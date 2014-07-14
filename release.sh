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

## upload to maven central 
URL="https://oss.sonatype.org/service/local/staging/deploy/maven2/"
REPO="sonatype-nexus-staging"

#todo: remove all snapshot dependencies
for project in "jnario-maven-plugin"
do
cd plugins/$project
mvn versions:set -DnewVersion=$version -DgenerateBackupPoms=false
mvn clean install
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/$project-$version.jar
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/$project-$version-sources.jar -Dclassifier=sources
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/$project-$version-javadoc.jar -Dclassifier=javadoc
cd ../..
done

cd plugins/org.jnario.lib.maven
mvn versions:set -DnewVersion=$version -DgenerateBackupPoms=false
mvn clean install
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/org.jnario.lib-$version.jar
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/org.jnario.lib-$version-sources.jar -Dclassifier=sources
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/org.jnario.lib-$version-javadoc.jar -Dclassifier=javadoc
cd ../..

cd plugins/org.jnario.standalone.maven
mvn versions:set -DnewVersion=$version -DgenerateBackupPoms=false
mvn clean install
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/org.jnario.standalone-$version.jar
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/org.jnario.standalone-$version-sources.jar -Dclassifier=sources
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/org.jnario.standalone-$version-javadoc.jar -Dclassifier=javadoc
cd ../..

cd plugins/jnario-maven-report-plugin
mvn versions:set -DnewVersion=$version -DgenerateBackupPoms=false
mvn clean install
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/report-$version.jar
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/report-$version-sources.jar -Dclassifier=sources
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/report-$version-javadoc.jar -Dclassifier=javadoc
cd ../..

cd plugins/jnario-maven-archetype
mvn versions:set -DnewVersion=$version -DgenerateBackupPoms=false
mvn clean install
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/jnario-archetype-$version.jar
mvn gpg:sign-and-deploy-file -Dpackaging=jar -Durl=$URL -DrepositoryId=$REPO -DpomFile=pom.xml -Dfile=target/jnario-archetype-$version-sources.jar -Dclassifier=sources
cd ../..
echo "Successfully staged maven artifacts. Manually close & release via https://oss.sonatype.org/index.html#stagingRepositories"
 
exit 1 
