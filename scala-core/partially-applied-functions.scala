// Son funciones en las que los parámetros no se cargan en un inicio, sino que al invocarla 
// la pasamos como variable solo con algunos de los parámetros. El resto se les pasará más tarde
// a través de la variable en la que se guardó:

// Ejemplo 1 © Apasoft Training
def calcular(num1:Int, num2:Int, num3:Int) = {num1+num2+num3}  // Función para calcular la suma de 3 números 
val x = calcular(1,2, _:Int)                                   // Introduzco los dos primeros números pero dejamos el tercero como _:Int y lo guardo en la variable x
println(x(5))                                                  // La variable x es una función que tomará los parámetros ya establecidos (1 y 2) y completará la función 
                                                               // con el parámetro que falte (5). Esta línea imprimirá el valor entero 8 (1 + 2 + 5)

// Ejemplo 2
