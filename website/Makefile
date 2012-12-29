BOOTSTRAP_LESS = ./bootstrap/less/bootstrap.less
BOOTSTRAP_RESPONSIVE = ./docs/assets/css/bootstrap-responsive.css
BOOTSTRAP_RESPONSIVE_LESS = ./bootstrap/less/responsive.less
LESS_COMPRESSOR ?= `which lessc`
WATCHR ?= `which watchr`

GH_PAGES = ../../jnario-gh-pages
LANG_JNARIO    = ../plugins/org.jnario/src/org/jnario/doc/js/lang-jnario.js 
CUSTOM_CSS     = ../plugins/org.jnario/src/org/jnario/doc/css/custom.css


#
# BUILD JNARIO
#
jnario:
	lessc ${BOOTSTRAP_LESS} > css/bootstrap.css
	lessc --compress ${BOOTSTRAP_LESS} > css/bootstrap.min.css
	lessc ${BOOTSTRAP_RESPONSIVE_LESS} > css/bootstrap-responsive.css
	lessc --compress ${BOOTSTRAP_RESPONSIVE_LESS} > css/bootstrap-responsive.min.css
	cat js/prettify.js ${LANG_JNARIO} bootstrap/js/bootstrap-transition.js bootstrap/js/bootstrap-alert.js bootstrap/js/bootstrap-button.js bootstrap/js/bootstrap-carousel.js bootstrap/js/bootstrap-collapse.js bootstrap/js/bootstrap-dropdown.js bootstrap/js/bootstrap-modal.js bootstrap/js/bootstrap-tooltip.js bootstrap/js/bootstrap-popover.js bootstrap/js/bootstrap-scrollspy.js bootstrap/js/bootstrap-tab.js bootstrap/js/bootstrap-typeahead.js > js/jnario.js
	uglifyjs -nc js/jnario.js > js/jnario.min.js
	cp ${LANG_JNARIO} js
	cp ${CUSTOM_CSS} css

#
# MAKE FOR GH-PAGES
#

RES_FOLDERS = img css js ico
SNAPSHOT_UPDATES = ${GH_PAGES}/updates/snapshot
LIB_JAR = org.jnario.lib-0.4.0-SNAPSHOT.jar

gh-pages: jnario
	rm -f ${GH_PAGES}/*.html
	cp -r *.html ${GH_PAGES} 
	for f in $(RES_FOLDERS) ; \
	do \
		echo ${GH_PAGES}/$$f ; \
		rm -f -r ${GH_PAGES}/$$f ; \
		mkdir -p ${GH_PAGES}/$$f ; \
		cp -r $$f/* ${GH_PAGES}/$$f ; \
	done 
	rm -r -f ${SNAPSHOT_UPDATES}
	mkdir -p ${SNAPSHOT_UPDATES}
	cp -r ../releng/org.jnario.updatesite/target/repository/* ${SNAPSHOT_UPDATES}
	rm -f ${SNAPSHOT_UPDATES}/${LIB_JAR}
	cp ../plugins/org.jnario.lib/target/${LIB_JAR} ${SNAPSHOT_UPDATES}
	rm -r -f ${GH_PAGES}/org
	mkdir -p ${GH_PAGES}/org
	cp -r -p ../tests/org.jnario.tests/doc-gen/org ${GH_PAGES}
	find ${GH_PAGES}/ -type f -iname "*.html" | xargs sed -i "" -e 's/<!-- \/container -->/<\!-- Start Google Analytics Installation --><script type="text\/javascript">var _gaq=_gaq\|\|\[\]\;_gaq.push\(\["_setAccount"\,"UA-30225034-1"\]\)\;_gaq.push\(\["_setDomainName"\,"jnario.org"\]\)\;_gaq.push\(\["_trackPageview"\]\)\;\(function\(\)\{var a=document.createElement\("script"\)\;a.type="text\/javascript"\;a.async=true\;a.src=\("https\:"==document.location.protocol\?"https\:\/\/ssl"\:"http:\/\/www"\)\+".google-analytics.com\/ga.js"\;var b=document.getElementsByTagName\("script"\)\[0\]\;b.parentNode.insertBefore\(a\,b\)\}\)\(\)<\/script><\!-- End Google Analytics Installation -->/'
	echo "This is the Jnario (www.jnario.org) snapshots update site." > ${GH_PAGES}/updates/snapshot/index.html 
	cd ${GH_PAGES} ; \
	git pull origin gh-pages ; \
	git add --all ; \
	git commit -a -m "new snapshot build" ; \
	git push origin gh-pages

html:
	rm -f ${GH_PAGES}/*.html
	cp -r *.html ${GH_PAGES} 
	for f in $(RES_FOLDERS) ; \
	do \
		echo ${GH_PAGES}/$$f ; \
		rm -f -r ${GH_PAGES}/$$f ; \
		mkdir -p ${GH_PAGES}/$$f ; \
		cp -r $$f/* ${GH_PAGES}/$$f ; \
	done 
	rm -r -f ${GH_PAGES}/org
	mkdir -p ${GH_PAGES}/org
	cp -r -p ../tests/org.jnario.tests/doc-gen/org ${GH_PAGES}
	find ${GH_PAGES}/ -type f -iname "*.html" | xargs sed -i "" -e 's/<!-- \/container -->/<\!-- Start Google Analytics Installation --><script type="text\/javascript">var _gaq=_gaq\|\|\[\]\;_gaq.push\(\["_setAccount"\,"UA-30225034-1"\]\)\;_gaq.push\(\["_setDomainName"\,"jnario.org"\]\)\;_gaq.push\(\["_trackPageview"\]\)\;\(function\(\)\{var a=document.createElement\("script"\)\;a.type="text\/javascript"\;a.async=true\;a.src=\("https\:"==document.location.protocol\?"https\:\/\/ssl"\:"http:\/\/www"\)\+".google-analytics.com\/ga.js"\;var b=document.getElementsByTagName\("script"\)\[0\]\;b.parentNode.insertBefore\(a\,b\)\}\)\(\)<\/script><\!-- End Google Analytics Installation -->/'
	echo "This is the Jnario (www.jnario.org) snapshots update site." > ${GH_PAGES}/updates/snapshot/index.html 
	cd ${GH_PAGES} ; \
	git pull origin gh-pages ; \
	git add --all ; \
	git commit -a -m "updated documentation" ; \
	git push origin gh-pages


#
# WATCH LESS FILES
#
watch:
	echo "Watching less files..."; \
	watchr -e "watch('less/.*\.less') { system 'make' }"


.PHONY: jnario watch gh-pages
