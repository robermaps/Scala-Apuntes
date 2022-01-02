// Las funciones anónimas o Functions Literals son funciones a las que no se les da nombre

// Ejemplo 1
val lista1 = List("Albacete", "Cádiz", "León", "Santander")
val lista2 = lista1.filter( (i)=>i.length <= 5 )                 // La función anónima se usa como filtro para todos los elementos de la lista1 que midan 5 caracteres o mennos
println(lista2)                                                // List(Cádiz, León)

// Ejemplo 2 - © Apasoft Training
val lista3 = List.range(1,10)                  // List(1, 2, 3, 4, 5, 6, 7, 8, 9)
var pares = lista3.filter( _%2==0 )            // En este caso tomará como valor bueno el que al dividir entre 2 de como resto 0
println(pares)                                 // List(2, 4, 6, 8)

// Ejemplo 3
pares.foreach( i => println(i*5) )        // Foreach itera sobre la lista pares y al valor de cada paso i le ordena imprimirse multiplicado por 5
                     // 10
                     // 20
                     // 30
                     // 40

