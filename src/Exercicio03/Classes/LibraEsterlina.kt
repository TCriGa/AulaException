package Exercicio03.Classes

import Exercicio03.Interface.ConversorMoeda
import java.math.BigDecimal


class LibraEsterlina(
    override var valorInserido: BigDecimal = BigDecimal.ZERO,
    override val valorDaCotacao: BigDecimal = BigDecimal(6.19),
    override var valorConvertido: BigDecimal = BigDecimal.ZERO,
    override var moeda: String = "Libra Esterlina"
) : ConversorMoeda {}