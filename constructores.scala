                                                                       //--** EJEMPLO 1 **--\\

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

  def resumen(): Unit ={                                                                                   // Método de clase
    println(s"La ciudad $nombre cuenta con $clientes clientes y tiene un presupuesto de $presupuesto")
    println(s"El ratio presupuesto/cliente para madrid es de $ratio")
  }

}

// Correr el código
object prueba1 {
  def main(args: Array[String]): Unit = {
    
    var ciudad1 = new Ciudad("Córdoba", 200)                // La ciudad Córdoba ha sido creada (CONSTRUCTOR PRINCIPAL - el valor de presupuesto y de ratio será 0)
    var ciudad2 = new Ciudad("Segovia", 200, 50000)         // La ciudad Segovia ha sido creada (CONSTRUCTOR AUXILIAR)
   
    ciudad1.resumen()                                       // La ciudad Córdoba cuenta con 200 clientes y tiene un presupuesto de 0 
                                                            // El ratio presupuesto/cliente para Córdoba es de 0   
    ciudad2.resumen()                                       // La ciudad Segovia cuenta con 200 clientes y tiene un presupuesto de 50000
                                                            // El ratio presupuesto/cliente para Segovia es de 250
  }
}



                                                                       //--** EJEMPLO 2 **--\\

class Ciudad {                                        // CONSTRUCTOR PRINCIPAL SIN ARGUMENTOS
  
  println("Ciudad creada")
  private var nombre:String = _                 
  private var altitud:Int = _  
  private var clientes:Int = _                 
  private var presupuesto:Int = _  
  
  def this(nombre: String, altitud: Int) {            // CONSTRUCTOR AUXILIAR 1
    this()                                            // Referencia al constructor principal
    this.nombre = nombre                              
    this.altitud = altitud   
  }
  
  def this(clientes: Int, presupuesto: Int) {         // CONSTRUCTOR AUXILIAR 2
    this()                                            // Referencia al constructor principal. 
                                                      // SI SE QUISIESE PODRÍA REFERENCIARSE AL OTRO CONSTRUCTOR AUXILIAR PARA INICIARLO TAMBIÉN PERO DEBEN COINCIDIR LOS PARÁMETROS
    this.clientes = clientes                              
    this.presupuesto = presupuesto
  }  
  
  def resumen1(): Unit ={                                                                                   // Método de clase
    println(s"La ciudad $nombre tiene una altitud de $altitud")
  }

  def resumen2(): Unit ={                                                                                   // Método de clase
    println(s"Hay $clientes clientes y un presupuesto de $presupuesto")
  }
  
}


// Correr el código
object prueba2 {
  def main(args: Array[String]): Unit = {
    
    var ciudad1 = new Ciudad1("Lugo", 465)    // Ciudad creada
    var ciudad2 = new Ciudad1(25, 6000)       // Ciudad creada
    
    ciudad1.resumen1()                        // La ciudad Lugo tiene una altitud de 465
    ciudad1.resumen2()                        // Hay 0 clientes y un presupuesto de 0

    ciudad2.resumen1()                        // La ciudad null tiene una altitud de 0
    ciudad2.resumen2()                        // Hay 25 clientes y un presupuesto de 6000

  }
}

