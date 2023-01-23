/**
 * Transforme une chaine TRUE ou FALSE en boolean
 * Renvoie une exception si ce n'est pas un boolean'
 */
$.boolean = function(string) {

	if (string == "TRUE") {
		return true;
	} else if (string == "FALSE") {
		return false;
	} 
		
	throw 'String is not a boolean';
}
