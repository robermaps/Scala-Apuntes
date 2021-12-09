// Docs: https://docs.scala-lang.org/overviews/collections-2.13/introduction.html
// Las colecciones de Scalas se encuentran en la clase scala.collection

//** LISTAS - scala.collection.immutable - todos los elementos son del mismo tipo

// Crear listas
val lista1 = List("montaña", "río", "pantano")   // List[String]
val lista2 = List(24, 76, 200)                   // List[Int]
val lista3 = List("montaña", "río", 5)           // List[Any] - Any es la clase principal de Scala
val lista4 = List()                              // List[Nothing] 

val lista5 = List[String]("montaña", "río", 5)             // Error
val lista55 = List[String]("montaña", "río", "pantano")    // List[String]

var lista6 = List.fill(4)("geo")   // List[String] = List(geo, geo, geo, geo)

// Posiciones
lista1(0)   // val res1: String = montaña
lista2(1)   // val res2: Int = 76
lista3(2)   // val res3: Any = 5

// Métodos
print(lista1.last)      // pantano
print(lista1.head)      // montaña
print(lista2.length)    // 3
print(lista4.isEmpty)   // true
print(lista1.reverse)   // List(pantano, río, montaña)

// Iterar sobre listas
for (z <- lista1) println(z)   // montaña
                               // pantano
                               // río

// Modificar listas - Al ser de tipo inmutable hay que 'rehacerlas'
lista2 = lista2:+55             // ERROR - reassignment to val
lista6 = lista6:+"geografía"    // List(geo, geo, geo, geo, geografía) 
lista6 = 55+:lista6             // ERROR - type mismatch
lista6 = "geografía"+:lista6    // List(geografía, geo, geo, geo, geo, geografía)

// Unir listas
lista1:::lista2   // List("montaña", "río", "pantano", 24, 76, 200) - Cambia a tipo List[Any] al combinar enteros con cadenas

// Anidar listas
lista1::lista2    // List(List("montaña", "río", "pantano"), 24, 76, 200) - List[Any]


//** LIST BUFFER - scala.collection.mutable - Pueden modificarse directamente
import scala.collection.mutable.ListBuffer
val lista7 = ListBuffer( 1, 2, 3, 4, 5, 6)

// Añadir valores
lista7 += 7          // ListBuffer(1, 2, 3, 4, 5, 6, 7)
lista7.append(8)     // ListBuffer(1, 2, 3, 4, 5, 6, 7, 8)

// Modificar una posición concreta
lista7(4) = 24       // ListBuffer(1, 2, 3, 4, 24, 6, 7, 8)

// Eliminar un valor 
lista7 -= 8          // ListBuffer(1, 2, 3, 4, 24, 6, 7)

// Eliminar una posición
lista7.remove(0)           // ListBuffer(2, 3, 4, 24, 6, 7) 
print(lista7.remove(0))    // 2 - el método .remove devuelve el objeto borrado además de modificar la lista

// Eliminar varias posiciones
val lista8 = ListBuffer(99, 42, 65)
lista8.remove(0, 2)      
print(lista8)         // ListBuffer(65) - La última posición no la borra


//** ARRAY - la longitud de la lista no se puede cambiar (no se pueden añadir o borrar elementos)
val array1 = Array("montaña", "río", "pantano")

// Especificar el tipo de array
val array1:Array[String] = Array("montaña", "río", "pantano")

// Modificar una posición
array1(1) = "colina"         // Array("montaña", "colina", "pantano")

// Arrays vacíos
val array2:Array[Int] = new Array(4)                   // Array(0, 0, 0, 0) - Nuevo array de 4 posiciones de enteros
val array3:Array[String] = new Array(2)                // Array(null, null) - Nuevo array de 4 posiciones de cadenas
val array4:Array[String] = new Array(array2.length)    // Array(null, null, null, null) - Copia la longitud de otro array
val array44:Array[Int] = new Array(array2.size)        // Array(0, 0, 0, 0) - Distinto método mismo resultado

// Crear arrays con un rango
val array5:Array[Int] = (1 to 5).toArray[Int]          // Array(1, 2, 3, 4, 5) - Convierte un rango en array y lo guarda en el nuevo val

// Sustituir valores de un array dentro de otro




