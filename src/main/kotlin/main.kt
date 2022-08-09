/**
 * PROPIEDADES DE CLASE
 */

fun main() {
    /*
    val miNombre = Alumno("Emanuel","Munoz")
    println(miNombre.nombreCompleto)
    miNombre.nombreCompleto = "Daniel Munoz"
    println(miNombre.nombreCompleto)

    println("***** Cantante 1 *****")
    val cantanteCristiano = Cantante("Funki","Regueton")
    println(cantanteCristiano.informacion)
    cantanteCristiano.informacion = "Indiomar canta Salsa"
    println(cantanteCristiano.informacion)

    println("***** Cantante 2 *****")
    val cantantePopular = Cantante("Michael Jackson","pop")
    println(cantantePopular.informacion)
    cantantePopular.informacion = "Ed Sheeran canta romantica"
    println(cantantePopular.informacion)


    val producto = Electrodomestico("Licuadora","Oster")
    //Get
    println(producto.descripcion)
    //Set
    producto.descripcion = "Sarten Recco"
    println(producto.descripcion)

*/
    println("******* Prenda 1 *****")
    val producto = Vestimenta("Polo","XL")
    // Get
    println(producto.prendaDeVestir)
    // Set
    producto.prendaDeVestir = "Pantalon S"
    println(producto.prendaDeVestir)

    println("******* Prenda 2 *****")
    val producto2 = Vestimenta("Pantalon","L")
    // Get
    println(producto2.prendaDeVestir)
    // Set
    producto2.prendaDeVestir = "Polo S"
    println(producto2.prendaDeVestir)




    println("****** Libro 1 ******")
    val libro = LibroBiblia("Genesis","Antiguo")
    // Get
    println(libro.laBiblia)
    // Set
    libro.laBiblia = "Zacarias esta en Antiguo testamento"
    println(libro.laBiblia)

    println("****** Libro 2 ******")
    val libro2 = LibroBiblia("Mateo","Nuevo")
    // Get
    println(libro2.laBiblia)
    // Set
    libro2.laBiblia = "Juan esta en Nuevo testamento"
    println(libro2.laBiblia)



}


/**
 * TAREA 1:
 *
 * Crear una clase "Cantante"
 * con atributos "nombre" y "generoMusical" (romantica, regueton, rock)
 * crear propiedad que tenga por valor "$nombre canta $generoMusical"
 *
 * println("***** Cantante 1 *****")
 * Crear 2 objetos
 * 1. Que muestre su propiedad
 * 2. Que le reasigne un nuevo valor
 *
 */
