class Vestimenta (var nombre: String, var talla: String) {
    init {
        println("Bloque init")
    }
    var prendaDeVestir : String ="$nombre es talla $talla"
    get() = "Descripcion: $field"
    set(value) {
        if(talla.equals("XL")){
            field = "Nesesita bajar de peso"
        } else {
            field = value
        }
    }
}
/**
 * TAREA 2:
 *
 * Crear una clase "Vestimenta"
 * con atributos "nombre" y "talla" (S, M, L, XL)
 * crear propiedad que tenga por valor "$nombre es talla $talla"
 *
 * Crear 2 objetos
 * 1. (GET) Que obtenga el valor de propiedad: "Descripcion: $field"
 * 2. (SET) Que le reasigne un nuevo valor con condición:
 * Si talla es igual a "XL", field = "Necesita bajar de peso",
 * sino field = value
 *
 */