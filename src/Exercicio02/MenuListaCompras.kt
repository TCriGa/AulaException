package Exercicio02

import kotlin.system.exitProcess

class MenuListaCompras {

    private val verduras = Verduras()
    private val legumes = Legumes()
    private val graos = Graos()
    private val outrosAlimentos = OutrosAlimentos()

    init {
        println("|------------------- Bem Vindo aos sistema de Lista de Compras -------------|")
    }

    private fun menu() {
        println("|-------------------* Digite a opção desejada para cadastrar: *-------------|")
        println("|-------------------* 01 - Verdura *----------------------------------------|")
        println("|-------------------* 02 - Legumes *----------------------------------------|")
        println("|-------------------* 03 - Grãos *------------------------------------------|")
        println("|-------------------* 04 - Outros Alimentos *-------------------------------|")
        println("|-------------------* 05 - Mostrar Lista de Alimentos *---------------------|")
        println("|-------------------* 06 - Sair *-------------------------------------------|")
    }

    fun adicionaisMaisAlimentos(alimentos: ListaDeCompras) {

        println("Deseja inserir mais alimentos? Digite 1- Sim/ 2- Não")
        var newAlimentos = readln().toInt()
        if (newAlimentos == 1) {
            alimentos.inserirAlimento()

        } else if (newAlimentos == 2) {
            opcaoMenu()

        } else if (newAlimentos != 1 && newAlimentos != 2) {
            println("Número inválido. Digite novamente")
            println("Deseja inserir mais verduras? Digite 1- Sim/ 2- Não")
            newAlimentos = readln().toInt()


        }
    }



    fun opcaoMenu() {
        try {
            menu()
            do {

                when (readln().toInt()) {
                    1 -> {
                        verduras.inserirAlimento()
                        verduras.validarQtdAlimentos()
                        adicionaisMaisAlimentos(verduras)
                    }
                    2 -> {
                        legumes.inserirAlimento()
                        adicionaisMaisAlimentos(legumes)
                    }
                    3 -> {
                        graos.inserirAlimento()
                        adicionaisMaisAlimentos(graos)
                    }
                    4 -> {
                        outrosAlimentos.inserirAlimento()
                        adicionaisMaisAlimentos(outrosAlimentos)
                    }
                    5 -> {
                        verduras.mostrarLista()
                        legumes.mostrarLista()
                        graos.mostrarLista()
                        outrosAlimentos.mostrarLista()
                    }
                    6 -> {
                        println("Obrigada por utilizar nosso sistema!! :D")
                        exitProcess(0)
                    }
                    else -> println("Opção inválida. Digite novamente.")


                }
            } while (true)
        } catch (ex: IllegalArgumentException) {
            println(" Tipo de Alimento Inválido ")
        }
    }


}