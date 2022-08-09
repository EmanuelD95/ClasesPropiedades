class LibroBiblia (var nombre: String, var testamento: String){
    init {
        println("Bloque init")
    }
    var laBiblia : String ="$nombre esta en $testamento testamento"
        get() = "Detalle: $field"
        set(value) {
            if (value.startsWith("Zacarias")){
                field = "$value, es el ultimo libro en orden alfabetico"
            } else {
                field = value
            }
        }

}
/**
 * TAREA 3:
 *
 * Crear una clase "LibroBiblia"
 * con atributos "nombre" y "testamento" (Antiguo, Nuevo)
 * crear propiedad que tenga por valor "$nombre está en $testamento testamento"
 *
 * Crear 2 objetos
 * 1. (GET) Que obtenga el valor de propiedad: "Detalle: $field"
 * 2. (SET) Que le reasigne un nuevo valor con condición:
 * Si 'value' empieza con "Zacarias", field = "$nombre es el último libro en orden alfabético",
 * sino field = value
 *
 */