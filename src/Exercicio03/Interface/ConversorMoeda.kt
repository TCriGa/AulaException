package Exercicio03.Interface

import Exercicio03.MSG_VALOR_DECIMAL
import Exercicio03.MSG_VALOR_INVALIDO
import java.math.BigDecimal
import java.time.LocalDate


interface ConversorMoeda {
    var valorInserido: BigDecimal
    val valorDaCotacao: BigDecimal
    var valorConvertido: BigDecimal
    var moeda: String

   fun solicitarValorMoeda(mensagem: String): BigDecimal {
        try {
            println(mensagem)
            valorInserido = readln().toBigDecimalOrNull() ?: throw NumberFormatException()
            verificarValorInserido(MSG_VALOR_INVALIDO)
        } catch (ex: NumberFormatException) {
            println(MSG_VALOR_DECIMAL)
        }

        converterMoerda()
        return valorInserido
    }

    fun verificarValorInserido(mensagem: String) {
        if (valorInserido < BigDecimal.ZERO) {
            solicitarValorMoeda(mensagem = mensagem)
        } else println("Valor inserido com sucesso")
    }

    fun converterMoerda(): BigDecimal {
        valorConvertido = valorInserido * valorDaCotacao

        return valorConvertido
    }

    fun mostrarValorConvertido() {
        println("O (A) $moeda na cotação de hoje ${LocalDate.now()}, está em %2f,".format(valorDaCotacao) +
                " o valor que pediu para converter de $valorInserido em reais é R$ %2f ".format(valorConvertido))
    }
}