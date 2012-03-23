BOOTSTRAP_LESS = ./bootstrap/less/bootstrap.less
BOOTSTRAP_RESPONSIVE = ./docs/assets/css/bootstrap-responsive.css
BOOTSTRAP_RESPONSIVE_LESS = ./bootstrap/less/responsive.less
LESS_COMPRESSOR ?= `which lessc`
WATCHR ?= `which watchr`

GH_PAGES = ../../jnario-gh-pages
LANG_JNARIO_SPEC    = ../org.jnario/src/org/jnario/doc/lang-jnario-spec.js 
LANG_JNARIO_FEATURE = ../org.jnario/src/org/jnario/doc/lang-jnario-feature.js 
#
# BUILD JNARIO
#
jnario:
	lessc ${BOOTSTRAP_LESS} > css/bootstrap.css
	lessc --compress ${BOOTSTRAP_LESS} > css/bootstrap.min.css
	lessc ${BOOTSTRAP_RESPONSIVE_LESS} > css/bootstrap-responsive.css
	lessc --compress ${BOOTSTRAP_RESPONSIVE_LESS} > css/bootstrap-responsive.min.css
	lessc --compress less/jnario.less > css/jnario.min.css
	cat js/prettify.js ${LANG_JNARIO_SPEC} ${LANG_JNARIO_FEATURE} bootstrap/js/bootstrap-transition.js bootstrap/js/bootstrap-alert.js bootstrap/js/bootstrap-button.js bootstrap/js/bootstrap-carousel.js bootstrap/js/bootstrap-collapse.js bootstrap/js/bootstrap-dropdown.js bootstrap/js/bootstrap-modal.js bootstrap/js/bootstrap-tooltip.js bootstrap/js/bootstrap-popover.js bootstrap/js/bootstrap-scrollspy.js bootstrap/js/bootstrap-tab.js bootstrap/js/bootstrap-typeahead.js > js/jnario.js
	uglifyjs -nc js/jnario.js > js/jnario.min.js
	

#
# MAKE FOR GH-PAGES 4 FAT & MDO ONLY (O_O  )
#

gh-pages: jnario
	rm -r ${GH_PAGES}/img
	rm -r ${GH_PAGES}/css
	rm -r ${GH_PAGES}/js
	rm ${GH_PAGES}/*.html
	mkdir ${GH_PAGES}/img
	mkdir ${GH_PAGES}/css
	mkdir ${GH_PAGES}/js
	cp -r img/* ${GH_PAGES}/img
	cp -r js/* ${GH_PAGES}/js
	cp -r css/* ${GH_PAGES}/css
	cp -r *.html ${GH_PAGES}

#
# WATCH LESS FILES
#

watch:
	echo "Watching less files..."; \
	watchr -e "watch('less/.*\.less') { system 'make' }"


.PHONY: jnario watch gh-pages
