package Exercicio02

class OutrosAlimentos : ListaDeCompras() {
    private val listaOutrosAlimentos = mutableSetOf<OutrosAlimentos>()

    override fun inserirAlimento() {
        try {
            println("Informe o nome de outros alimentos:")
            nomeAlimento = readln()

            println("Informe a quantidade em unidades:")
            qtdOutrosAlimentos = readln().toInt()
            validarQtdAlimentos()

        } catch (ex: NumberFormatException) {
            println("Para outros, a quantidade deve ser informada em unidades inteiras")
        } catch (ex: UnsupportedOperationException) {
            println("Não é permitido inserir valor vazio")
        }
    }

    override fun validarQtdAlimentos() {
        when (qtdOutrosAlimentos < 0) {
            true -> {
                println("Quantidade negativa não permitido. Digite novamente")
                inserirAlimento()

            }
            false -> {
                println("Alimento Registrado com sucesso")
                val adicionarOutrosAlimentos = OutrosAlimentos()
                adicionarOutrosAlimentos.nomeAlimento = nomeAlimento
                adicionarOutrosAlimentos.qtdOutrosAlimentos = qtdOutrosAlimentos
                listaOutrosAlimentos.add(adicionarOutrosAlimentos)
            }
        }
    }


    override fun mostrarLista() {
        println("|-------------------------------------* Lista de outros Alimentos *--------------------------------")
        listaOutrosAlimentos.forEach {
            println("${it.nomeAlimento} -> ${it.qtdOutrosAlimentos} unidade")
        }
        println("A quantidade de alimentos do tipo outros alimentos a ser comprada é = ${listaOutrosAlimentos.size}")
    }
}
