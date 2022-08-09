/** PROPIEDADES
 * GETTER Y SETTER
 * (GET Y SET)
 * OBTENER Y ESTABLECER
 * */

class Electrodomestico (var nombre: String, var marca: String) {

    init {
        println("Bloque init")
    }

    var descripcion : String ="$nombre $marca"
        get() = "Detalle: $field"
        set(value) {
            if (value.startsWith("S")){
                field = value
            }else{
                field = "No empieza con S"
            }
        }


}