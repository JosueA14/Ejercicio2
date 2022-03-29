package model

class Serie : Entregable {
    var titulo: String
    var numTemporadas: Int
    var entregado: Boolean
    var genero: String
    var creador: String

    constructor() {
        this.titulo = ""
        this.numTemporadas = 3
        this.entregado = false
        this.genero = ""
        this.creador = ""
    }

    constructor(titulo: String, creador: String) {
        this.titulo = titulo
        this.numTemporadas = 3
        this.entregado = false
        this.genero = ""
        this.creador = creador
    }
    constructor(titulo: String, numTemporadas: Int, genero: String, creador: String) {
        this.titulo = titulo
        this.numTemporadas = numTemporadas
        this.entregado = false
        this.genero = genero
        this.creador = creador
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