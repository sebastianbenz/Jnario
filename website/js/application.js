$(document).ready(function() {
	$('a')
	  .filter(function() {
	  	var ref = this.href
        return !ref.match("#myCarousel") && ref.match(/#/);
      })
      /*
	  .bind("click", function(event) {
		event.preventDefault();
		var ziel = $(this).attr("href");
		
		$('html,body').animate({
			scrollTop: $(ziel).offset().top
		}, 2000 , function (){location.hash = ziel;});
	  */
	});
	return false;
});

prettyPrint();
$('.nav-collapse').collapse({
  toggle: false
});
$('#navbar').scrollspy();
//$('.carousel').carousel()