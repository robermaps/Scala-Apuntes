// Los traits o "interfaces" son plantillas con métodos y constantes para aplicar a las clases
// Podemos crear varias clases extendiendo un trait para que todas esas clases tomen las funciones del trait

// Crear un Trait
trait trait1 {  
  var altitud: Integer = _
  
  def Imprimir(nombre: String): Unit = {
    var texto = s"La montaña se llama $nombre"
    println(texto.toUpperCase)    
  }
}

// Crear una nueva clase que herede los métodos y variables del trait
class Montaña extends trait1

// Usar el método del trait en un objeto de la nueva clase
var monte1 = new Montaña()
monte1.Imprimir("Veleta")     // LA MONTAÑA SE LLAMA VELETA

// Acceder a una variable del trait
monte1.altitud = 3394
val pico = monte1.altitud
print(pico)                   // 3394

// Modificar un método definido en el trait para que no lo imprima en mayúscula
class Montaña extends trait1 {
  
  override def Imprimir(nombre: String): Unit = {
    var texto = s"La montaña se llama $nombre"
    println(texto)
    
  } 
}

