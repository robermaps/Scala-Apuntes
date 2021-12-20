// Los objetos singleton son el equivalente a las clases estáticas de otros lenguajes
// Estos objetos NO PUEDEN INSTANCIARSE, es decir, no se pueden crear variables de esta clase con el comando - new - 
// Todos los métodos de un singleton object son públicos = accesibles desde todo el programa
// No puedo pasarle parámetros para el constructor primario
// Pueden extender otras clases y traits, es decir, pueden adoptar variables y métodos de otras clases y traits

// Crear un singleton object
object españa {
  val poblacion = 47
  val superficie = 506
  def resumen():Unit = {
    println(s"España tiene una población de $poblacion millones y una superficie de $superficie mil Km2")
  }
}

// Singleton object como entrada a la aplicación
object entrada {
  def main(args: Array[String]): Unit = {
    // código de la aplicación
    println(españa.poblacion)               // 47
    españa.resumen()                        // España tiene una población de 47 millones y una superficie de 506 mil Km2
    val pais = new españa()                 // not found: type españa - ERROR 
  }
}
