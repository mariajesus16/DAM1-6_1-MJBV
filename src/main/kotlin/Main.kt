open class Planta(protected var tamanio: Int, protected var color: String) {
    fun fotosintesis() {
        println("La planta está haciendo la fotosintesis.")
        tamanio + 1
    }
}

class Cactus(tamanio: Int, color: String) : Planta(tamanio, color) {
    fun danio() {
        println("El cactus ha echo un daño.")
    }
}

class Girasol(tamanio: Int, color: String) : Planta(tamanio, color) {
    fun heliotropismo(sol: Boolean) {
        if (sol == true) {
            println("El girasol se mueve hacia el sol.")
        }
    }
}
/*c)Extensión.
d) La superclase es la class Planta y subclase la class Cactus y Girasol.*/

open class Mueble(
    protected var nombre: String,
    protected var material: String,
    private var numeroPatas: Int,
    protected var color: String
) {
    override fun toString(): String {
        return "Mueble $nombre de material $material y de color $color."
    }
}

class Silla(nombre: String, material: String, numeroPatas: Int, color: String) :
    Mueble(nombre, material, numeroPatas, color) {

    override fun toString(): String {
        return "Mueble $nombre de material $material y de color $color sirve para que las personas se puedan sentar."
    }
}

class Mesa(nombre: String, material: String, numeroPatas: Int, color: String) :
    Mueble(nombre, material, numeroPatas, color) {

    override fun toString(): String {
        return "Mueble $nombre de material $material y de color $color sirve como plataforma."
    }
}

/*c) Especialización.
d) La superclase es la class Mueble y subclase la class Silla y Mesa.*/
fun main() {
    val silla = Silla("Bergumb", "Roble", 4, "Negro")
    val mesa = Mesa("Arteg", "Roble", 4, "Blanco")
    println(silla.toString())
    println(mesa.toString())
    val girasol = Girasol(30, "Amarillo")
    val cactus = Cactus(10, "Verde")
    girasol.heliotropismo(true)
    cactus.danio()
    girasol.fotosintesis()
    cactus.fotosintesis()

}