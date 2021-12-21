// Los companion objects son métodos y properties estáticas
// Se crean como objetos singleton y se asocian a una clase que posea el mismo nombre
// Deben estar en el mismo fichero que la clase principal

// Clase principal
class parcela(superficie:Double, valor:Int, tipo:String) {
  
  def resumen():Unit = {
    println(s"Superficie: $superficie")
    println(s"Valor: $valor")
    println(s"Tipo: $tipo")
  }
  
  var factor:Double = _
  
  def precio_metro():Double = {
    tipo match {
      case "RURAL" => factor = 0.7
      case "URBANIZABLE" => factor = 1
      case "URBANO" => factor = 1.2
    }

    (valor/superficie)*factor        // Devuelve un valor Double
    
  }
}


// Companion object para predefinir el parámetro 'tipo' de la clase principal
// Debe tener el mismo nombre que la clase anterior
object parcela {
  val tipo_rural = "RURAL"                                                      // Variables estáticas
  val tipo_urbano = "URBANO"
  val tipo_urbanizable = "URBANIZABLE"
  
  def ponderaciones():Unit = {                                                  // Método estático
    println("Ponderaciones: Rural = 0.7 | Urbanizable = 1 | Urbano = 1.2")
  }   
}

// main
object main {
  def main(args: Array[String]):Unit ={
    
    var parcela1 = new parcela(500,3000, parcela.tipo_urbano)        // Parámetro tipo tomado de la variable estática 
    
    parcela1.resumen()                  // Superficie: 500.0
                                        // Valor: 3000
                                        // Tipo: URBANO
    
    println(parcela1.precio_metro())    // 7.199999999999999
    
    parcela.ponderaciones()             // Ponderaciones: Rural = 0.7 | Urbanizable = 1 | Urbano = 1.2
  }
}
