/**
 * Merge two method (A tester par rapport au contexte)
 */
$.mergeFunction = function(functionStart, functionEnd) {
	
	return (args) => {
		if (!$.isUndefined(functionStart)) {
			functionStart.call(this, args);
		} 
		
		if (!$.isUndefined(functionEnd)) {
			functionEnd.call(this, args);
		}
	}
}