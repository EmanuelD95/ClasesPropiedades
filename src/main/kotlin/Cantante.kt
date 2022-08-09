class Cantante(var nombre: String, var generoMusical: String) {
    var informacion : String = "$nombre canta $generoMusical"

    init {
        println("Bloque Init")

    }
}
