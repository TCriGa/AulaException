package Exercicio02

class Legumes() : ListaDeCompras() {
    private val listaLegumes = mutableSetOf<Legumes>()

    override fun inserirAlimento() {
        try {
            println("Informe o nome do Legume:")
            nomeAlimento = readln()

            println("Informe a quantidade em unidades:")
            qtdLegumes = readln().toInt()
            validarQtdAlimentos()
        } catch (ex: NumberFormatException) {
            println("Para legume, a quantidade deve ser informada em unidades inteiras")
        } catch (ex: UnsupportedOperationException) {
            println("N�o � permitido inserir valor vazio")
        }
    }

    override fun validarQtdAlimentos() {
        when (qtdAlimento < 0) {
            true -> {
                println("Quantidade negativa n�o permitido. Digite novamente")
                inserirAlimento()

            }
            false -> {
                println("Alimento Registrado com sucesso")
                val adicionarListaLegumes = Legumes()
                adicionarListaLegumes.nomeAlimento = nomeAlimento
                adicionarListaLegumes.qtdLegumes = qtdLegumes
                listaLegumes.add(adicionarListaLegumes)
            }
        }
    }


    override fun mostrarLista() {
        println("|-------------------------------------* Lista de Legumes *--------------------------------")
        listaLegumes.forEach {
            println("${it.nomeAlimento} -> ${it.qtdLegumes} unidade")
        }
        println("A quantidade de alimentos do tipo legumes a ser comprada � = ${listaLegumes.size}")
    }
}

