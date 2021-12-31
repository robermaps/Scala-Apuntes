// case class permite implementar métodos y componentes de forma automática cuando creamos una clase:
//   - Companion object con método apply para crear instancias sin la cláusula new
//   - Implementa métodos como hashCode, copy o equals

case class mapa(escala:Integer, capas:List[String])

object prueba {
  def main(args: Array[String]): Unit = {
    
    var mapa1 = mapa(5000, List("Fronteras", "Ciudades", "Ríos"))
    var mapa2 = mapa1.copy(2000)
    
    println(mapa1.capas(1))              // Ciudades
    println(mapa2)                       // mapa(2000,List(Fronteras, Ciudades, Ríos))
    println(mapa1.productElement(0))     // 5000
    println(mapa1.hashCode())            // -1222483568
    println(mapa1.equals(mapa2))         // false
    
  }
}
