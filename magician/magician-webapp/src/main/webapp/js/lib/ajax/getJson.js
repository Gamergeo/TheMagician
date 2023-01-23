$.getJson = function(options) {

	options.dataType = 'json';
	
	if (!options.error) {
		options.error = $.handleError;
	}
	
	return $.get(options);
}