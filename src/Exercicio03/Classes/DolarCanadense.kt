package Exercicio03.Classes

import Exercicio03.Interface.ConversorMoeda
import java.math.BigDecimal

class DolarCanadense(
    override var valorInserido: BigDecimal = BigDecimal.ZERO,
    override val valorDaCotacao: BigDecimal = BigDecimal(3.92),
    override var valorConvertido: BigDecimal = BigDecimal.ZERO,
    override var moeda : String = " Dólar Canadense"
) : ConversorMoeda {
}