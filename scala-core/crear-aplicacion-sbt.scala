// Al crear un proyecto se crean una serie de directorios en función del arquetipo usado. En este caso se usará el sbt ddentro del IDE IntelliJ

// Ficheros del proyecto sbt :
// - .idea -> Ficheros del IDE IntelliJ para el funcionamiento del proyecto
// - build.sbt -> Archivo con las properties del proyecto, se mantendrá automáticamente
// - target -> Donde se guardarán los resultados del proyecto
// - src -> Código fuente. Tiene dos carpetas: /main (código fuente) y /test y cada una con una carpeta /scala

// Para construir aplicaciones en scala tendremos que crear un paquete (package) en la carpeta src/main/scala (el de ejemplo se llamará prueba1)
// Después tendremos que crear dentro de ese package un object (New/Scala class/Object) que servirá como entrada para ejecutar la aplicación. 
// Se puede hacer de dos maneras:

// 1 - Objeto con extends App (trait) 
package prueba1

object aplicacion1 extends App {
  println("Hola Mundo")
}

// 2 - Objeto con una función main (más habitual)
package prueba1

object aplicacion2 {
  def main(args: Array[String]): Unit =  
    println("Hola Mundo")                  
}

// El código que se ejecutará al pulsar ▶ Run será el que se encuentre dentro de del objeto creado
// Las clases, traits y demás elementos se definirán por lo general antes del objeto, o en su defecto en otros packages o archivos del proyecto

