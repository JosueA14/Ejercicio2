package model

class VideoJuegos : Entregable {
    var titulo: String
    var horasEstimadas: Int
    var entregado: Boolean
    var genero: String
    var compania: String

    constructor() {
        this.titulo = ""
        this.horasEstimadas = 10
        this.entregado = false
        this.genero = ""
        this.compania = ""
    }

    constructor(titulo: String, compania: String) {
        this.titulo = titulo
        this.horasEstimadas = 3
        this.entregado = false
        this.genero = ""
        this.compania = compania
    }
    constructor(titulo: String, horasEstimadas: Int, genero: String, compania: String) {
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        this.entregado = false
        this.genero = genero
        this.compania = compania
    }

    override fun entregar() {
        this.entregado = true;
    }

    override fun devolver() {
        this.entregado = false;
    }

    override fun isEntregado(): Boolean {
        return this.entregado
    }

}