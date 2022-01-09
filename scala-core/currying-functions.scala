// Las funciones curry permiten transformar funciones con varios argumentos en funciones de argumentos simples

// Las siguientes funciones devuelven el mismo resultado:
def media (num1:Int, num2:Int) = println((num1+num2)/2)
def media_curry (num1:Int) (num2:Int) = println((num1+num2)/2)

// Se invocan de manera distinta:
media(56, 88)          // 72
media_curry(56)(88)    // 72 

// De un modo más formal, las currying functions pueden definirse de la siguiente manera:
def media_curry2 (num1:Int): Int => Unit = (num2:Int) => println((num1+num2)/2)

// Una buena forma de aprovechar estas funciones es con las funciones parciales (partially applied functions):
val media1 = media_curry(30)_  
media1(50)    // 40 

// Cuando escribimos estas funciones de la manera 'formal' podemos prescindir del _
val media2 = media_curry2(30)
media2(50)    // 40
