/**
 * Return text or val depending of the element
 */
jQuery.fn.parseVal = function() {
	return parseInt($(this).val());
};