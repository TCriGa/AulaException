package Exercicio02

abstract class ListaDeCompras(
    var nomeAlimento: String = "",
    var qtdAlimento: Double = 0.0,
    var qtdLegumes: Int = 0,
    var qtdOutrosAlimentos: Int = 0
) {

    abstract fun mostrarLista()
    abstract fun inserirAlimento()
    abstract fun validarQtdAlimentos()

}