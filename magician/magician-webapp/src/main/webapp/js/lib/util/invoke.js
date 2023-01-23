/**
 * Invoke method without changing context
 */
Function.prototype.invoke = function(args) {
    var i, code = 'this(';
    for (i=0; i<args.length; i++) {
        if (i) { code += ',' }
        code += 'args[' + i + ']';
    }
    eval(code + ');');
}