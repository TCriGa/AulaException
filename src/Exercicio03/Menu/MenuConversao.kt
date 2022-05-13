package Exercicio03.Menu

import Exercicio03.Classes.DolarCanadense
import Exercicio03.Classes.Euro
import Exercicio03.Classes.LibraEsterlina
import Exercicio03.Classes.DolarAmericano
import Exercicio03.MSG_MOEDA_INVALIDA
import Exercicio03.MSG_PEDINDO_VALOR
import kotlin.system.exitProcess

class MenuConversao {
    val dolarAmericano = DolarAmericano()
    val dolarCanadense = DolarCanadense()
    val libraEsterlina = LibraEsterlina()
    val euro = Euro()

    init {
        println("Bem vindo ao sistema de convers�o de moeda para Real (R$)")

    }

    private fun menu() {
        println("|===============* Digite a op��o desejada *==================|")
        println("|--------------- 1 - D�lar Americano ------------------------|")
        println("|--------------- 2 - D�lar Canadense ------------------------|")
        println("|--------------- 3 - Libra Esterlina ------------------------|")
        println("|--------------- 4 - Euro -----------------------------------|")
        println("|--------------- 5 - Sair -----------------------------------|")

        println("****Esse sistema realiza convers�o somente para Real****")
    }

    fun digitarOpcaoMenu() {
        try {
            do {
                menu()
                when (readln().toInt()) {
                    1 -> {
                        dolarAmericano.solicitarValorMoeda(MSG_PEDINDO_VALOR)
                        dolarAmericano.mostrarValorConvertido()
                    }
                    2 -> {
                        dolarCanadense.solicitarValorMoeda(MSG_PEDINDO_VALOR)
                        dolarCanadense.mostrarValorConvertido()
                    }
                    3 -> {
                        libraEsterlina.solicitarValorMoeda(MSG_PEDINDO_VALOR)
                        libraEsterlina.mostrarValorConvertido()
                    }
                    4 -> {
                        euro.solicitarValorMoeda(MSG_PEDINDO_VALOR)
                        euro.mostrarValorConvertido()
                    }
                    5 -> {
                        println("Obrigada por utilizar nosso sistema!! :)")
                        exitProcess(0)
                    }
                    else -> println("Op��o inv�lida, Digite novamente.")
                }
            } while (true)

        } catch (ex: IllegalArgumentException) {
            println(MSG_MOEDA_INVALIDA)
            digitarOpcaoMenu()
        }

    }

}