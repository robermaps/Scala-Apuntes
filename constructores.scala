// Crear una clase 
class Ciudad(nombre: String, clientes: Int) {               // Este es el CONSTRUCTOR PRINCIPAL

  println(s"La ciudad $nombre ha sido creada")              // Estas variables forman parte del constructor principal y se inicializan con él
  private var presupuesto:Int = _                 
  private var ratio:Int = _             

  def this(nombre: String, clientes: Int, presupuesto: Int) {     // Este es el CONSTRUCTOR AUXILIAR
    this(nombre: String, clientes: Int)                           // Invocar al constructor principal - OBLIGATORIO
    this.presupuesto = presupuesto                                // Resolver el nuevo argumento para que pase al constructor principal y que tenga efecto
    this.ratio = presupuesto / clientes                           // Calcular un nuevo valor para añadirlo al constructor principal
  }

  def resumen(): Unit ={
    println(s"La ciudad $nombre cuenta con $clientes clientes y tiene un presupuesto de $presupuesto")
    println(s"El ratio presupuesto/cliente para madrid es de $ratio")
  }

}

// Correr el código
object hola {
  def main(args: Array[String]): Unit = {
    
    var ciudad1 = new Ciudad("Córdoba", 200)                // La ciudad Córdoba ha sido creada (CONSTRUCTOR PRINCIPAL - el valor de presupuesto y de ratio será 0)
    var ciudad2 = new Ciudad("Segovia", 200, 50000)         // La ciudad Segovia ha sido creada (CONSTRUCTOR AUXILIAR)
   
    ciudad1.resumen()                                       // La ciudad Córdoba cuenta con 200 clientes y tiene un presupuesto de 0 
                                                            // El ratio presupuesto/cliente para Córdoba es de 0   
    ciudad2.resumen()                                       // La ciudad Segovia cuenta con 200 clientes y tiene un presupuesto de 50000
                                                            // El ratio presupuesto/cliente para Segovia es de 250
  }
}
