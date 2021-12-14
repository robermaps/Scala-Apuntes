// Crear una clase
class Ciudad(nombre: String, altitud: Int, superficiekm2: Float) {        // Constructor - OPCIONAL -> Parámetros obligatorios para crear la clase (private properties) 
  
  def resumen(): Unit =                                                   // Método de clase
    println("Nombre: " + nombre)
    println("Altitud: " + altitud)
    println("Superficie: " + superficiekm2)
  
  var poblacion:Int = _                                                   // Variable de la clase (public property)
  
}

// Crear un objeto de la clase Ciudad
var ciudad1 = new Ciudad("Madrid", 660, 604.3)

// Usar el método resumen()
ciudad1.resumen()  // Altitud: 650
                   // Superficie: 604.5
                   // Nombre: Madrid

// Ver la clase del objeto ciudad1 a través de un método público
print(ciudad1.getClass)   // class package.Ciudad - se supone que hemos creado esta clase en un package dentro de nuestro proyecto

// Editar la variable de la clase y visualizarla
ciudad1.poblacion = 3223000
print(ciudad1.poblacion)      // 3223000


