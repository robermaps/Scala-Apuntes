// Se pueden crear variables MUTABLES sin darles un valor
// Scala puede asignar valores predeterminados según del tipo de dato indicado

val x:String =_     // error (solo con var)

var x:String =_     // null
var u:Char = _      // \u0000 (null character)
var x:Int =_        // 0
var u:Short = _     // 0
var u:Long = _      // 0
var x:Double =_     // 0.0
var u:Float = _     // 0.0
var x:Range =_      // null
var u:Byte = _      // 0
var u:Boolean = _   // true
var u:Unit = _      // ()

// Útil cuando no sabemos el valor que va a tomar pero queremos asegurarnos del tipo
