package Exercicio02

import kotlin.system.exitProcess

class MenuListaCompras {

    init {
        println("|------------------- Bem Vindo aos sistema de Lista de Compras -------------|")
    }

    fun menu() {
        println("|-------------------* Digite a opção desejada para cadastrar: *-------------|")
        println("|-------------------* 01 - Verdura *----------------------------------------|")
        println("|-------------------* 02 - Legumes *----------------------------------------|")
        println("|-------------------* 03 - Grãos *------------------------------------------|")
        println("|-------------------* 04 - Outros Alimentos *-------------------------------|")
        println("|-------------------* 05 - Mostrar Lista de Alimentos *---------------------|")
        println("|-------------------* 06 - Sair *-------------------------------------------|")
    }

    fun opcaoMenu() {
        try {
            menu()
            do {
                when (readln().toInt()) {
                    1 -> Verduras().inserirVerduras()
                    2 -> Legumes().inserirLegumes()
                    3 -> Graos().inserirGraos()
                    4 -> OutrosAlimentos().inserirOutrosAlimentos()
                    5 ->{
                        Verduras().mostrarLista()
                        Legumes().mostrarLista()
                        Graos().mostrarLista()
                        OutrosAlimentos().mostrarLista()
                    }
                    6 -> {
                        println("Obrigada por utilizar nosso sistema!! :D")
                        exitProcess(0)
                    }
                    else -> println("Opção inválida. Digite novamente.")


                }
            } while (true)
        }catch (ex:IllegalArgumentException){
            println(" Tipo de Alimento Inválido ")
        }
        }



}