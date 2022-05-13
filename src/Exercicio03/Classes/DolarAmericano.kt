package Exercicio03.Classes

import Exercicio03.Interface.ConversorMoeda
import java.math.BigDecimal

class DolarAmericano(
    override var valorInserido: BigDecimal = BigDecimal.ZERO,
    override var valorDaCotacao: BigDecimal = BigDecimal(5.06),
    override var valorConvertido: BigDecimal = BigDecimal.ZERO,
    override var moeda: String = "Dólar Americano"

) : ConversorMoeda {

}