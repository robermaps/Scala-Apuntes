// Los rangos pueden guardarse como objetos de tipo Range

// Rango con enteros
val ent = 1 to 10

// Rango con valores 'char'
val minus = 'a' to 'z' 

// Rangos sin incluir el último valor
val ent2 = 1 until 10  
val minus2 = 'a' until 'z'

//Rangos con saltos
val ent3 = 0 until 30 by 5

// Acceder a un valor de un rango por su posición (desde 0)
ent(1)  //2
minus(15)  //p 

// Imprimir en bucle for 
for (x <- ent){print(x)}  //12345678910
for (x <- minus){print(x)}  //abcdefghijklmnopqrstuvwxyz
for (x <- ent2){print(x)}  //123456789
for (x <- ent3){print(x + " ")}  //0 5 10 15 20 25
for (x <- minus3){print(x + " ")}  //a d g j m p s v y 


