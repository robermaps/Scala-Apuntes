// Se pueden realizar instancias sin NEW definiendo un método apply dentro de un companion objects
// Ejemplo:

// Clase principal
class parcelaa(superficie:Double, valor:Int, tipo:String) {

  def resumen():Unit = {
    println(s"Superficie: $superficie | Valor: $valor | Tipo: $tipo")
  }

}

// Companion object
object parcelaa {

  val tipo_rural = "RURAL"
  val tipo_urbano = "URBANO"
  val tipo_urbanizable = "URBANIZABLE"

  // Método apply que devuelve un objeto del tipo de la clase principal
  def apply(superficie:Double, valor:Int, tipo:String): parcelaa = {      // Toma los mismos argumentos que el constructor principal
    new parcelaa(superficie:Double, valor:Int, tipo:String)               // Genera el objeto con los valores
  }
}

// Main
object main1 {
  def main(args: Array[String]):Unit ={
    var parcela1 = parcelaa(750.5 ,45000 , parcela.tipo_rural)    // Variable definida SIN NEW
    parcela1.resumen()                                            // Superficie: 750.5 | Valor: 45000 | Tipo: RURAL
  }
}
