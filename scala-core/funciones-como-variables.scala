// Ejemplo 1 - Media de dos números
val media = (num1:Float,num2:Float) => {(num1+num2)/2}
println(media(50,39))   // 44.5

// Ejemplo 2 - Jugar a cara o cruz
import scala.math.random
val caraocruz = (num:Int)  => for (z <- 1 to num) { if (random >= 0.5) println("Cara") else println("Cruz")}
caraocruz(5)     // Cruz
                 // Cruz
                 // Cara
                 // Cruz
                 // Cruz

// Ejemplo 3 © Apasoft Training - Filtrar los números pares de una lista
val lista1 = List.range(1,10)
val par = (num:Int) => num%2==0
println(lista1.filter(par))

// Ejemplo 4 - Números aleatorios entre 0 y el número pasado como parámetro
import scala.math.random
def randomulti = {(x:Int) => (x*random).round}
val aleatorio = randomulti
println(aleatorio(100))    // 58
println(aleatorio(45))     // 33
