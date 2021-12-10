// Docs: https://docs.scala-lang.org/overviews/collections-2.13/introduction.html
// Las colecciones de Scalas se encuentran en la clase scala.collection

//** LISTAS 
//** scala.collection.immutable - todos los elementos son del mismo tipo

// Crear listas
val lista1 = List("montaña", "río", "pantano")   // List[String]
val lista2 = List(24, 76, 200)                   // List[Int]
val lista3 = List("montaña", "río", 5)           // List[Any] - Any es la clase principal de Scala
val lista4 = List()                              // List[Nothing] 

val lista5 = List[String]("montaña", "río", 5)             // Error
val lista55 = List[String]("montaña", "río", "pantano")    // List[String]
val lista555 = List[Char]('a', 'b', 'c')                   // List[Char]

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
lista1:::lista2      // List("montaña", "río", "pantano", 24, 76, 200) - Cambia a tipo List[Any] al combinar enteros con cadenas

// Anidar listas
lista1::lista2       // List(List("montaña", "río", "pantano"), 24, 76, 200) - List[Any]

// Comparar listas
lista1 == lista2     // false


//** LIST BUFFER
//** Pueden modificarse directamente
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


//** ARRAY 
//** la longitud de la lista no se puede cambiar (no se pueden añadir o borrar elementos)
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
val array6:Array[Int] = (11 to 17).toArray[Int]        // Array(11, 12, 13, 14, 15, 16, 17)

// Sustituir valores de un array dentro de otro
// Se copiarán 2 posiciones de la array5 empezando
// por la 0 en la array6 a partir de la posición 3
Array.copy(array5, 0, array6, 3, 2)
print(array6)                         // Array(11, 12, 13, 1, 2, 16, 17)

// Concatenar arrays
Array.concat(array5, array6)          // Array(1, 2, 3, 4, 5, 11, 12, 13, 14, 15, 16, 17)


//** ARRAY BUFFER 
//** Permite cambiar el tamaño del array (mutable)
import scala.collection.mutable.ArrayBuffer
var arrayb1 = ArrayBuffer(20, 30, 40)

// Añadir un valor al final
arrayb1 += 50                     // ArrayBuffer(20, 30, 40, 50)

// Añadir una lista 
arrayb1 ++= List(60, 70, 80)      // ArrayBuffer(20, 30, 40, 50, 60, 70, 80)

// Borrar un elemento
arrayb1 -= 60                     // ArrayBuffer(20, 30, 40, 50, 70, 80)

// Borrar varios elementos
arrayb1 --= List(70, 80)          // ArrayBuffer(20, 30, 40, 50)


//** SET
//** No se puede repetir ningún valor. Por defecto son immutable.
var set1 = Set("Madrid", "Soria", "Jaén")        // scala.collection.immutable.Set[String] = Set(Madrid, Soria, Jaén)
var set2 = Set(1, 2, 3)                          // scala.collection.immutable.Set[Int] = Set(1, 2, 3)

// Comprobar si existe un elemento en el set
set1("Madrid")      // val res1: Boolean = true
set1("Lleida")      // val res2: Boolean = false

// Añadir elementos al set
set1 += "Álava"     // Set("Madrid", "Soria", "Jaén", "Álava")                 

// Unir sets
set3 = set1++set2   // scala.collection.immutable.Set[Any] = HashSet(1, Jaén, 2, 3, Madrid, Soria, Álava)

// Borrar un elemento
set1 - "Soria"      // Set("Madrid", "Jaén")  


//** MAPS
//** Conjunto de elementos con clave-valor
var map1 = Map((1, "Argentina"), (2, "Perú"), (3, "Colombia"))          // scala.collection.immutable.Map[Int,String] = Map(1 -> Argentina, 2 -> Perú, 3 -> Colombia)
var map2 = Map('a' -> "Bosque" , 'b' -> "Desierto", 'c' -> "Lago")      // scala.collection.immutable.Map[Char,String] = Map(a -> Bosque, b -> Desierto, c -> Lago)

// Acceder a los valores a través de la clave
map1(3)    // Colombia
map2('b')  // Desierto

// Añadir un elemento al map en una nueva variable
map1 + (4 -> "Chile")          // val res1: Map(1 -> Argentina, 2 -> Perú, 3 -> Colombia, 4 -> Chile) - no se modifica el map
map2 + (('d', "Marisma"))      // val res2: Map(a -> Bosque, b -> Desierto, c -> Lago, d -> Marisma)
  
// Modificar un map - al ser de tipo inmutable hay que 'rehacerlas'
print(map1)                     // Map(1 -> Argentina, 2 -> Perú, 3 -> Colombia)
map1 = map1 + (4 -> "Chile")    // mutated map1
print(map1)                     // Map(1 -> Argentina, 2 -> Perú, 3 -> Colombia, 4 -> Chile)

map1 = map1 - 4    // mutated map1
print(map1)        // Map(1 -> Argentina, 2 -> Perú, 3 -> Colombia)        


