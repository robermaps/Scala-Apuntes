// Las funciones curry permiten transformar funciones con varios argumentos en funciones de un único argumento

// Las siguientes funciones son iguales:
def media (num1:Int, num2:Int) = println((num1+num2)/2)
def media_curry (num1:Int) (num2:Int) = println((num1+num2)/2)

// Se invocan de manera distinta:
media(56, 88)          // 72
media_curry(56)(88)    // 72 

