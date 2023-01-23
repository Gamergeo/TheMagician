/**
 * Get percentage width of an element
 */
$.fn.percentageWidth = function() {
	return $(this).width() / $(this).parent().width() * 100;
}