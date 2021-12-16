//** Crear una clase PRINCIPAL **\\
class Ciudad(nombre: String, altitud: Int, var superficiekm2: Double) {    // Constructor - OPCIONAL -> Parámetros obligatorios para crear la clase. 
                                                                           // Son por defecto Private salvo que vayan precedidos de un var o val, que pasarían a ser Public
  
  def resumen(): Unit = {                                                  // Método de clase
    println("Nombre: " + nombre)
    println("Altitud: " + altitud)
    println("Superficie: " + superficiekm2)
  }
                                                                           // Variables de clase
  var poblacion:Int = _                                                    // Public -> puede accederse desde cualquier lado
  private var recaudacion:Double = _                                       // Private -> solo puede accederse a través de la clase y sus subclases
  protected var gasto:Double = _                                           // Protected -> solo se puede acceder a través de la clase (al igual que los parámetros)
  
}

// Crear un objeto de la clase Ciudad
var ciudad1 = new Ciudad("Madrid", 660, 604.3)

// Usar el método resumen()
ciudad1.resumen()  // Altitud: 650
                   // Superficie: 604.5
                   // Nombre: Madrid

// Ver la clase del objeto ciudad1 a través de un método público
print(ciudad1.getClass)       // class package.Ciudad - se supone que hemos creado esta clase en un package dentro de nuestro proyecto

// Editar la variable de la clase y visualizarla
ciudad1.poblacion = 3223000
print(ciudad1.poblacion)      // 3223000


//** Crear una clase HIJA o SUBCLASE **\\
// Tomará los métodos y properties de la clase principal y lo ampliará con los suyos propios
class Barrio extends Ciudad("Granada", 738, 88.02) {           // Debe usarse el constructor de la clase principal
  
  var nombreBarrio: String = _     
  var postal: Integer = _  
  
  def resumenBarrio() : Unit = {
    println(s"El barrio $nombreBarrio tiene el código postal $postal y una población de $poblacion habitantes")
  }
}

// Crear objeto de la subclase
var barrio1 = new Barrio         // No tiene parámetros porque no tiene constructor. Sin embargo ha tomado los que se definieron al crear la subclase Barrio

// Usar el método resumen() heredado de la clase principal
barrio1.resumen()  // Altitud: 738
                   // Superficie: 88.02
                   // Nombre: Granada

// Ver la clase del objeto ciudad1 
print(barrio1.getClass)       // class package.Barrio

// Editar las variables del objeto 
barrio1.nombreBarrio = "Albaicín"
barrio1.postal = 18010      
barrio1.poblacion = 8277      // Variable heredada

// Método exclusivo de la subclase
barrio1.resumenBarrio()       // El barrio Albaicín tiene el código postal 18010 y una población de 8277 habitantes


