 /**
 * Definition of icontains selector
 * Work like contains but incensitive
 */
$.expr[':'].icontains = function(a, i, m) {
	return jQuery(a).text().toUpperCase()
		.indexOf(m[3].toUpperCase()) >= 0;
};