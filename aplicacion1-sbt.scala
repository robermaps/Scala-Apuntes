// Al crear un proyecto se crean una serie de directorios en función del arquetipo usado. En este caso se usará el sbt ddentro del IDE IntelliJ

// Ficheros del proyecto sbt :
// - .idea -> Ficheros del IDE IntelliJ para el funcionamiento del proyecto
// - build.sbt -> Archivo con las properties del proyecto, se mantendrá automáticamente
// - target -> Donde se guardarán los resultados del proyecto
// - src -> Código fuente. Tiene dos carpetas: /main (código fuente) y /test y cada una con una carpeta /scala

// Para construir aplicaciones en scala tendremos que crear un paquete (package) en la carpeta src/main/scala (el de ejemplo se llamará prueba1)
// Después tendremos que crear dentro de ese package el primer object (New/Scala class/Object) que será el que ejecute la aplicación. 
// Se puede hacer de dos maneras:

// 1 - Objeto que con extends App (trait) 
package prueba1

object hola extends App {
  println("Hola Mundo")
}

// 2 - Con una función main dentro de nuestro object
package prueba1

object hola {
  def main(args: Array[String]): Unit =  
    println("Hola Mundo")
}



