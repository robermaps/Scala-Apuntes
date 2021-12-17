// Los traits o "interfaces" son plantillas con métodos y constantes para aplicar a las clases
// Podemos crear varias clases extendiendo un trait para que todas esas clases tomen las funciones del trait

// Crear un Trait
trait trait1 {  
  
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

// Modificar un método definido en el trait para que no lo imprima en mayúscula
class Montaña extends trait1 {
  
  override def Imprimir(nombre: String): Unit = {
    var texto = s"La montaña se llama $nombre"
    println(texto)
    
  } 
}

// Implementar varios traits a una clase (en Scala no hay herencia múltiple)
// Crear un nuevo trait
trait trait2 {
  def Imprimir2(provincia: String): Unit = {
    println(s"Está ubicada en la provincia de $provincia")
  }
}

trait trait3 {
  var altitud: Int = _
  def Imprimir3(): Unit = {
    println(s"Tiene una altitud de $altitud metros")
  }
}

// Crear una clase que tome los traits 1 y 2
class Montaña extends trait1 with trait2 with trait3

// Usar los métodos y variables del los traits 2 y 3
monte1.altitud = 3394
monte1.Imprimir2("Granada")  // Está ubicado en la provincia de Granada
monte1.Imprimir3()           // Tiene una altitud de 3394 metros

