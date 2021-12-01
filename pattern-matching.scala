// Declaración match para evaluar el valor de una variable
val provincia = "Castellón"

provincia match {
     | case "La Rioja" => print("La Rioja")
     | case "Castellón"  => print("Castellón")
     | case "Zamora" => print("Zamora")
     | }                                      //Castellón

// Cláusula _ para evaluar otros valores
val provincia = "Málaga"

provincia match {
     | case "La Rioja" => print("La Rioja")
     | case "Castellón"  => print("Castellón")
     | case "Zamora" => print("Zamora")
     | case _ => print("Otra provincia")
     | }                                      //Otra provincia

// Devolviendo valores en vez de prints
val provincia = "Zamora"

provincia match {
     | case "La Rioja" => 1
     | case "Castellón"  => 2
     | case "Zamora" => 3
     | case _ => 0
     | }                                      //val res1: Int = 3

// Valores que comparten evaluación
val provincia = "Burgos"

provincia match {
     | case "La Rioja" => 1
     | case "Castellón" | "Valencia"  => 2
     | case "Zamora" | "Burgos" => 3
     | case _ => 0
     | }                                      //val res1: Int = 3

// Se puede combinar con if para evaluar valores en otros objetos
val provincia = "Burgos"
val provincia2 = "Málaga"

provincia match {
     | case "Burgos" if (provincia2 == "Segovia") => print("Ambas son castellanas")
     | case "Burgos" if (provincia2 != "Segovia")  => print("Solo Burgos")
     | }                                    
                                              //Solo Burgos



