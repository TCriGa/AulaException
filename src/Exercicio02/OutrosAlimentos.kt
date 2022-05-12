package Exercicio02

class OutrosAlimentos : ListaDeCompras() {
    private val listaOutrosAlimentos = mutableSetOf<OutrosAlimentos>()
    private var contador = 0


    override fun inserirAlimento() {
        try {
            println("Informe o nome do Legume:")
            nomeAlimento = readln()

            println("Informe a quantidade em Kg:")
            qtdOutrosAlimentos = readln().toInt()
            contador++

            val adicionarOutrosAlimentos = OutrosAlimentos()
            adicionarOutrosAlimentos.nomeAlimento = nomeAlimento
            adicionarOutrosAlimentos.qtdOutrosAlimentos = qtdOutrosAlimentos
            listaOutrosAlimentos.add(adicionarOutrosAlimentos)

        } catch (ex: NumberFormatException) {
            println("Para outros, a quantidade deve ser informada em unidades inteiras")
        } catch (ex: UnsupportedOperationException) {
            println("Não é permitido inserir valor vazio")
        }
    }

    override fun validarQtdAlimentos() {
        TODO("Not yet implemented")
    }


    override fun mostrarLista() {
        println("|-------------------------------------* Lista de Legumes *--------------------------------")
        listaOutrosAlimentos.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento} unidade")
        }
        println("A quantidade de alimentos do tipo legumes a ser comprada é = $contador")
    }
}
