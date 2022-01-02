// Las funciones que admiten como entrada o que devuelven otras funciones se denominan Higher Class Funcions o Funciones de Primera Clase
// Recomiendo el siguiente artículo -> https://alvinalexander.com/scala/fp-book/how-write-functions-take-function-input-parameters/

// Ejemplo 1: función que toma como entrada una función y la devuelve como salida imprimiendo decoradores antes y después de su ejecución
object prueba {

  def decorador(callback: () => Unit ) {   // Esta sería la función de primera clase. 'Callback' es el nombre de la variable, '()' indica que debe ser una función y '=> Unit' que debe devolver un unit
    println("======XY======")
    callback()
    println("==============")
  }

  class lugar(val coordx:Int, val coordy:Int) {
    def coordenadas():Unit = { println(coordx,coordy) }
  }

  def main(args: Array[String]): Unit = {          
    val lugar1 = new lugar(645456,51554)

    decorador(lugar1.coordenadas)              // ======XY======
                                               // (645456,51554)
  }                                            // ==============
}
