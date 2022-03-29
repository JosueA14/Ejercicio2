import model.Serie
import model.VideoJuegos

fun main(args: Array<String>) {
    println("Bienvenido")

    var series = arrayOf<Serie>()

    val serie1 = Serie("GOT", 8, "Drama", "David")
    val serie2 = Serie("Breaking Bad", 3, "Suspenso", "Pepe")
    val serie3 = Serie("Betty", 4, "Suspenso", "Maria")
    val serie4 = Serie("Breaking Bad", 3, "Terror", "Cristina")
    val serie5 = Serie("Sherlock", "Will")
    serie5.genero = "Comedia"

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    var videojuegos = arrayOf<VideoJuegos>()

    val videojuego1 = VideoJuegos("videojuego1", 15, "MOBA", "Sony")
    val videojuego2 = VideoJuegos("videojuego2", 23, "Accion", "Nintendo")
    val videojuego3 = VideoJuegos("videojuego3", 55, "Shooter", "Riot Games")
    val videojuego4 = VideoJuegos("videojuego4", 17, "Estrategia", "Ubisoft")
    val videojuego5 = VideoJuegos("videojuego5", "Epic Games")
    videojuego5.genero = "Terror"

    videojuegos = videojuegos.plus(videojuego1)
    videojuegos = videojuegos.plus(videojuego2)
    videojuegos = videojuegos.plus(videojuego3)
    videojuegos = videojuegos.plus(videojuego4)
    videojuegos = videojuegos.plus(videojuego5)

    serie1.entregar()
    serie3.entregar()
    videojuego1.entregar()
    videojuego5.entregar()

    var contador: Int = 0

    println("Series entregadas: " )
    for (i in series.indices) {
        if(series[i].isEntregado()){
            contador++
            println(series[i].titulo)
        }

    }
    println("Contador Series entregadas: " + contador + "\n")
    contador = 0
    println("VideoJuegos entregadas: " )
    for (i in videojuegos.indices) {
        if (videojuegos[i].isEntregado()) {
            contador++
            println(videojuegos[i].titulo)
        }
    }

    println("Contador VideoJuegos entregados: " + contador + "\n")

}