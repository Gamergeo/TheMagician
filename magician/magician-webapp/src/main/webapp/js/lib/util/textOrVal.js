/**
 * Return text or val depending of the element
 */
jQuery.fn.textOrVal = function(val) {

	if ($(this).is("input") || $(this).is("select")) {
		
		if ($.isEmptyObject(val)) {
			return $(this).val();
		}
		
		return $(this).val(val);
	}

	if ($.isEmptyObject(val)) {
		return $(this).text();
	}
	
	return $(this).text(val);
};