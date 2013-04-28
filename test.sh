set -e
timestamp=$(date +%Y%m%d%H%M)
echo "preparing release"
echo "release version:"
read version
echo "next version:"
read nextversion
echo "Releasing $version"
sed -i '' 's/$version/$nextversion/g' releng/org.jnario.updatesite/category.xml
sed -i '' 's/$version/$nextversion/g' releng/org.jnario.updatesite/site.xml
