package Exercicio02

class Graos : ListaDeCompras() {
    private val listaGraos = mutableListOf<Graos>()

    override fun inserirAlimento() {
        try {
            println("Informe o nome do grão:")
            nomeAlimento = readln()

            println("Informe a quantidade em Kg:")
            qtdAlimento = readln().toDouble()
            validarQtdAlimentos()

        } catch (ex: NumberFormatException) {
            println("Para grãos, a quantidade deve ser informada com ponto")
        } catch (ex: UnsupportedOperationException) {
            println("Não é permitido inserir valor vazio")
        }
    }

    override fun validarQtdAlimentos() {
        when (qtdAlimento < 0) {
            true -> {
                println("Quantidade negativa não permitido. Digite novamente")
                inserirAlimento()
            }
            false -> {
                println("Alimento registrado com sucesso")
                val adicionarListaGraos = Graos()
                adicionarListaGraos.nomeAlimento = nomeAlimento
                adicionarListaGraos.qtdAlimento = qtdAlimento
                listaGraos.add(adicionarListaGraos)
            }

        }
    }

    override fun mostrarLista() {
        println("|-------------------------------------* Lista de Grãos *--------------------------------")
        listaGraos.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento}Kg")
        }
        println("A quantidade de alimentos do tipo Grãos a ser comprada é = ${listaGraos.size}")
    }
}
