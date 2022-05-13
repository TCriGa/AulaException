package Exercicio03.Classes

import Exercicio03.Interface.ConversorMoeda
import java.math.BigDecimal

class Euro(
    override var valorInserido: BigDecimal = BigDecimal.ZERO,
    override val valorDaCotacao: BigDecimal = BigDecimal(5.26),
    override var valorConvertido: BigDecimal = BigDecimal.ZERO,
    override var moeda: String = "Euro"
) : ConversorMoeda {
}