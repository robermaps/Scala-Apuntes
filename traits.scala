// Los traits o "interfaces" son plantillas con métodos y constantes para aplicar a las clases
// Podemos crear varias clases extendiendo un trait para que todas esas clases tomen las funciones del trait

// Crear un Trait
trait trait1 {
  def Imprimir(nombre: String): Unit = {
    var texto = s"La montaña se llama $nombre"
    println(texto.toUpperCase)
  }
}

// Usarlo en una nueva clase
class Montaña extends trait1

// Usar el método del trait en un objeto de la nueva clase
var monte1 = new Montaña()
monte1.Imprimir("Veleta")     // LA MONTAÑA SE LLAMA VELETA
