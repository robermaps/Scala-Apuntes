// Docs: https://docs.scala-lang.org/overviews/collections-2.13/introduction.html
// Las colecciones de Scalas se encuentran en la clase scala.collection

// Listas - scala.collection.immutable - todos los elementos son del mismo tipo

val lista1 = list("montaña", "río", "pantano")   // List[string]
val lista2 = list(24, 76, 200)                   // List[Int]
val lista3 = list("montaña", "río", 5)           // List[Any] - Any es la clase principal de Scala

val lista4 = list[String]("montaña", "río", 5)   // Error

lista1(0)   // val res1: String = montaña
lista2(1)   // val res2: Int = 76
lista3(2)   // val res3: Any = 5

print(lista1.last)     // pantano
print(lista1.head)     // montaña
print(lista2.length)   // 3
