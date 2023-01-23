$.fn.closestChildren = function(selector) {
	
	let $found = $();
    let $currentSet = this.children(); // Current place

    while ($currentSet.length) {
        $found = $currentSet.filter(selector);
        
		if ($found.length) {
			 break;  // At least one match: break loop	
		}
		
        // Get all children of the current set
        $currentSet = $currentSet.children();
    }
    return $found; // Return found items
}    
