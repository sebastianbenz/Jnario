BOOTSTRAP_LESS = ./bootstrap/less/bootstrap.less
BOOTSTRAP_RESPONSIVE = ./docs/assets/css/bootstrap-responsive.css
BOOTSTRAP_RESPONSIVE_LESS = ./bootstrap/less/responsive.less
LESS_COMPRESSOR ?= `which lessc`
WATCHR ?= `which watchr`

GH_PAGES = ../../jnario-gh-pages
LANG_JNARIO    = ../org.jnario/src/org/jnario/doc/lang-jnario.js 
CUSTOM_CSS     = ../org.jnario/src/org/jnario/doc/custom.css


#
# BUILD JNARIO
#
jnario:
	lessc ${BOOTSTRAP_LESS} > css/bootstrap.css
	lessc --compress ${BOOTSTRAP_LESS} > css/bootstrap.min.css
	lessc ${BOOTSTRAP_RESPONSIVE_LESS} > css/bootstrap-responsive.css
	lessc --compress ${BOOTSTRAP_RESPONSIVE_LESS} > css/bootstrap-responsive.min.css
	lessc --compress less/jnario.less > css/jnario.min.css
	lessc --compress less/jnario-responsive.less > css/jnario-responsive.min.css
	cat js/prettify.js bootstrap/js/bootstrap-transition.js bootstrap/js/bootstrap-alert.js bootstrap/js/bootstrap-button.js bootstrap/js/bootstrap-carousel.js bootstrap/js/bootstrap-collapse.js bootstrap/js/bootstrap-dropdown.js bootstrap/js/bootstrap-modal.js bootstrap/js/bootstrap-tooltip.js bootstrap/js/bootstrap-popover.js bootstrap/js/bootstrap-scrollspy.js bootstrap/js/bootstrap-tab.js bootstrap/js/bootstrap-typeahead.js > js/jnario.js
	uglifyjs -nc js/jnario.js > js/jnario.min.js
	cp ${LANG_JNARIO} js
	cp ${CUSTOM_CSS} css

#
# MAKE FOR GH-PAGES 4 FAT & MDO ONLY (O_O  )
#

RES_FOLDERS = img css js 
SPEC_DOC = SpecInstantiation ImplicitSubject Pending ExampleTables
SNAPSHOT_UPDATES = ${GH_PAGES}/updates/snapshot

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
	cp -r ../org.jnario.updatesite/target/site/* ${SNAPSHOT_UPDATES}
	rm -f ${GH_PAGES}/updates/snapshot/org.jnario.lib-0.1.0-SNAPSHOT.jar
	cp ../org.jnario.lib/target/org.jnario.lib-0.1.0-SNAPSHOT.jar ${GH_PAGES}/updates/snapshot
	rm -r -f ${GH_PAGES}/org
	mkdir -p ${GH_PAGES}/org
	cp -r -p ../org.jnario.tests/doc-gen/org ${GH_PAGES}
	echo "This is the Jnario (www.jnario.org) snapshots update site." > ${GH_PAGES}/updates/snapshot/index.html 

#
# WATCH LESS FILES
#
watch:
	echo "Watching less files..."; \
	watchr -e "watch('less/.*\.less') { system 'make' }"


.PHONY: jnario watch gh-pages
