var x = 1

// Bucle while
while (x < 10) {print(x) ; x = x + 1}  //123456789

// Bucle do - while (siempre se ejecuta el primer paso)
do {print(x) ; x = x + 1} while (x < 10)  //123456789

// Bucle for (necesario usar rangos)
for (z <- 1 to 5) print("Hola" + z + " ")  //Hola1 Hola2 Hola3 Hola4 Hola5 

// Bucle for con condiciones if (solo números pares)
for (z <- 0 to 20 if z%2==0) print(z)  //02468101214161820

// Bucle for con una lista 
val lista1 = List("montaña", "río", "pantano")
for (z <- lista1) println(z)   // montaña
                               // pantano
                               // río

// Bucle para iterar sobre una lista
var x = 0
var resultado = 0
var numeros = List(1, 2, 3, 4, 5, 6, 7, 8)

numeros.foreach(x=>total=total+x)
print(resultado)                     // 36
