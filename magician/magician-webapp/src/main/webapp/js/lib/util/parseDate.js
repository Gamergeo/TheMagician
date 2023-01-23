/**
 * Transforme une date du format dd/mm/yyyy en mm/dd/yyyy
 */
$.parseDate = function(stringDate) {
	
	if (!stringDate) {
		return null;
	}
	
	let parts = stringDate.match(/(\d+)/g);
	
	if (parts[3]) {
		
		if (parts[4]) {
 			return new Date(parts[2], parts[1]-1, parts[0], parts[3], parts[4]);
		}
 		return new Date(parts[2], parts[1]-1, parts[0], parts[3]);
	}
	
 	return new Date(parts[2], parts[1]-1, parts[0]);
}

