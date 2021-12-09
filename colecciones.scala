// Docs: https://docs.scala-lang.org/overviews/collections-2.13/introduction.html
// Las colecciones de Scalas se encuentran en la clase scala.collection

// Listas - scala.collection.immutable - todos los elementos son del mismo tipo

val lista1 = List("montaña", "río", "pantano")   // List[String]
val lista2 = List(24, 76, 200)                   // List[Int]
val lista3 = List("montaña", "río", 5)           // List[Any] - Any es la clase principal de Scala
val lista4 = List()                              // List[Nothing] 

val lista5 = List[String]("montaña", "río", 5)   // Error

lista1(0)   // val res1: String = montaña
lista2(1)   // val res2: Int = 76
lista3(2)   // val res3: Any = 5

print(lista1.last)      // pantano
print(lista1.head)      // montaña
print(lista2.length)    // 3
print(lista4.isEmpty)   // true

for (z <- lista1) println(z)   // montaña
                               // pantano
                               // río

