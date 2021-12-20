// Los companion objects son métodos y properties estáticas
// Se crean como objetos singleton y se asocian a una clase que posea el mismo nombre

// Clase
class parcela(superficie:Double, valor:Int, tipo:String) {
  
  def resumen():Unit = {
    println(s"Superficie: $superficie")
    println(s"Valor: $valor")
    println(s"Tipo: $tipo")
  }
  
  var factor:Double = _
  
  def precio():Double = {
    tipo match {
      case "RURAL" => factor = 0.7
      case "URBANIZABLE" => factor = 1
      case "URBANO" => factor = 1.2
    }

    (valor/superficie)*factor
    
  }
}


// Companion object para predefinir el parámetro 'tipo'
// Debe tener el mismo nombre que la clase anterior
object parcela {
  val tipo_rural = "RURAL"
  val tipo_urbano = "URBANO"
  val tipo_urbanizable = "URBANIZABLE"
}

// main
object main {
  def main(args: Array[String]):Unit ={
    
    var parcela1 = new parcela(500,3000, parcela.tipo_urbano)    
    
    parcela1.resumen()            // Superficie: 500.0
                                  // Valor: 3000
                                  // Tipo: URBANO
    
    println(parcela1.precio())    // 7.199999999999999
    
  }
}
