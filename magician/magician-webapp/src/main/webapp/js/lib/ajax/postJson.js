$.postJson = function(options) {

	options.data = JSON.stringify(options.data)
	options.contentType = "application/json";
	
	if (!options.error) {
		options.error = $.handleError;
	}
	
	return $.post(options);
}