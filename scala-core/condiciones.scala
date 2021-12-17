var x = 24

// If 
if (x < 30) print(x)  //24 
if (x > 30) print(x)  // 
if (x == 24) {print(x); x = 54 ; print(" " + x)}  //24 54

// If - else
if (x > 30) print("Es mayor") else print("Es menor") //Es menor

// If como expresión - Se pueden guardar como objeto
val condicion = if (x > 30) "Es mayor" else "Es menor"
print(condicion)  //Es menor 

val condicion2 = if (x > 30) 1 else 0
print(condicion2)  //0
