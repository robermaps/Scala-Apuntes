// Un string o cadena es un array de caracteres
// Los caracteres llevan comillas simples 'a' y los strings "comillas dobles"

// Guardar una cadena como objeto
val cadena = "Roberto"

// Ver la longitud de la cadena
cadena.length                    // val res1: Int = 7
print(cadena.length)             // 7

// Obtener el primer y último caracter
cadena.head                      // R
cadena.last                      // o

// Mayúsculas y minúsculas
cadena.toLowerCase               // roberto
cadena.toUpperCase               // ROBERTO

// Iterar sobre los caracteres
cadena.toUpperCase.foreach(println)
                                 // R
                                 // O
                                 // B
                                 // E
                                 // R
                                 // T
                                 // O
