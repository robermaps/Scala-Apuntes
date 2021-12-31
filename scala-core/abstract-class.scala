// Las clases abstractas se diferencian en que permiten tener métodos abstractos
// Los métodos abstractos son métodos definidos en la clase principal a modo de plantilla 
// que deben resolverse cuando la clase abstracta a la que pertenecen es extendida 
// o cuando se crea un objeto de esa clase

// En el ejemplo se usa una clase abstracta unidad_admin como base para crear nuevas clases 
// que corresponderán a distintos tipos de unidades administrativas:

abstract class unidad_admin(nombre:String, poblacion:Integer) {    // CLASE ABSTRACTA PRINCIPAL
   var superficie:Double = _    // Variable abstracta
   def resumen:String           // Método abstracto
}

class ciudad(nombre:String, poblacion:Integer) extends unidad_admin(nombre, poblacion) {  // SUBCLASE 1     
  override def resumen:String = s"La ciudad se llama $nombre y tiene una población de $poblacion habitantes"   // Se resuelve el método abstracto 
}

class barrio(nombre:String, poblacion:Integer) extends unidad_admin(nombre, poblacion) {  // SUBCLASE 2         
  override def resumen:String = s"El barrio se llama $nombre y tiene una población de $poblacion habitantes"   // Se resuelve de otra manera
}

object awaw {
  def main(args: Array[String]): Unit = {

    var ciudad1 = new ciudad("Barcelona", 1620000)
    var barrio1 = new barrio("Vila de Gràcia", 50584)
    
    ciudad1.superficie = 101.65   
    println(ciudad1.superficie)    // 101.65

    println(ciudad1.resumen)       // La ciudad se llama Barcelona y tiene una población de 1620000 habitantes
    println(barrio1.resumen)       // El barrio se llama Vila de Gràcia y tiene una población de 50584 habitantes
    
  }
}
