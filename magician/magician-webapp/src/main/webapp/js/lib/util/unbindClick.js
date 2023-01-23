/**
 * Unbind click event
 */
$.fn.unbindClick = function() {
	
	return this.each(function() {
		$(this).attr("onclick", "").unbind("click");
	});
}