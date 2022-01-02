// Ejemplo 1
val media = (num1:Float,num2:Float) => {(num1+num2)/2}
println(media(50,39))   // 44.5

// Ejemplo 2
val caraocruz = (num:Int)  => for (z <- 1 to num) { if (random >= 0.5) println("Cara") else println("Cruz")}
caraocruz(5)     // Cruz
                 // Cruz
                 // Cara
                 // Cruz
                 // Cruz
