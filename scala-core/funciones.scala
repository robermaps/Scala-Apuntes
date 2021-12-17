//** Crear funciones sin argumentos **\\

def funcion1(): String = "Hola"           // val res1: String = Hola
def funcion2 = "Adiós"                    // val res2: String = Adiós - Definir sin paréntesis solo si la funcion es simple y no hace llamadas a otras funciones

print(funcion1)   // Hola 
funcion2          // Adiós 

// Funciones que no devuelven resultado (unit)
def funcion3(): Unit = "Hola" 
def funcion4() = print("Adiós")

función3   //
función4   // Adiós - Devuelve el resultado de la función print(), no un valor string


//** Crear funciones con argumentos **\\

// Media de dos números
def media(num1: Float, num2: Float): Float = {(num1 + num2)/2}

media(10, 15)    // val res3: Float = 12.5

// Texto de presentación
def presentacion(nombre: String, edad: Int, mayusculas: Boolean)=
{
  var frase = s"Me llamo $nombre y tengo $edad años"
  if (mayusculas == true) frase = frase.toUpperCase
  print(frase)
}

presentacion("Roberto", 26, true)     // ME LLAMO ROBERTO Y TENGO 26 AÑOS
presentacion(edad = 26, mayusculas = true, nombre = "Roberto")  // Mismo resultado. Se permite alterar el orden si se indica el nombre del argumento

// Calculadora - © Apasoft Training 
// Con valores por defecto
def calcular(operacion:String, numero1: Int = 1, numero2: Int = 1)=
      {
       if (numero2==0) {
            "No se puede dividir por 0"
      }
      else
      {
      operacion match {
         case "+" => numero1+numero2
         case "-" => numero1-numero2
         case "*" => numero1*numero2
         case "/" => numero1/numero1
         case _ => "Operacion Incorrecta"
      }
      }
      }

calcular("-", 30, 10)        // 20
calcular("+", 20)            // 21
calcular("+", numero2 = 5)   // 6

// Argumentos variables - © Apasoft Training 
def calcularMuchos(operacion:String, numeros: Int*) =             // El argumento numeros puede tener varias entradas
      {
       if (numeros.length<2) {
            "No se puede calcular con solo un número"
      }
      else
      {
      var total:Double=0
      if (operacion=="+" || operacion=="-")  total=0 else  total=1   // Evitar el valor 0 en multiplicaciones y divisiones
     
      operacion match {
         case "+" => {numeros.foreach(x=>total=total+x)       // El valor de cada número se guarda en x y la variable total se va actualizando sumándole ese valor
                      total}
         case "-" => {numeros.foreach(x=>total=total-x)
		      total
			}
         case "*" => {numeros.foreach(x=>total=total*x)
		      total}
         case "/" => {numeros.foreach(x=>total=total/x)
                      total}
         case _ => "Operacion Incorrecta"
      }
      }
      }

calcularMuchos("+", 1, 2, 3)    // val res1: Any = 6.0




