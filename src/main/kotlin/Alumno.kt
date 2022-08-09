/** PROPIEDADES */

class Alumno(var nombre: String, var apellido: String) {
    var nombreCompleto: String = "$nombre $apellido"

    init {
        println("Bloque Init")
        println("Esta clase ha sido creada para $nombreCompleto")
    }

    fun mostrarNombreCompleto() {
        println("$nombre $apellido")
    }

}