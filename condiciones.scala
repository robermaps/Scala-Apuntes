var x = 24

// If 
if (x < 30) print(x)  //24 
if (x > 30) print(x)  // 
if (x == 24) {print(x); x = 54 ; print(" " + x)}  //24 54

// If - else
if (x > 30) print("Es mayor") else print("Es menor") //Es menor

// Se pueden guardar como objeto (If como expresión)
val condicion = if (x > 30) "Es mayor" else print"Es menor"
print(condicion)  //Es menor
