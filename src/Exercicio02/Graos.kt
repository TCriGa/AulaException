package Exercicio02

class Graos : ListaDeCompras() {
    private val listaGraos = mutableListOf<Graos>()

    override fun inserirAlimento() {
        try {
            println("Informe o nome do gr�o:")
            nomeAlimento = readln()

            println("Informe a quantidade em Kg:")
            qtdAlimento = readln().toDouble()
            validarQtdAlimentos()

        } catch (ex: NumberFormatException) {
            println("Para gr�os, a quantidade deve ser informada com ponto")
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
                println("Alimento registrado com sucesso")
                val adicionarListaGraos = Graos()
                adicionarListaGraos.nomeAlimento = nomeAlimento
                adicionarListaGraos.qtdAlimento = qtdAlimento
                listaGraos.add(adicionarListaGraos)
            }

        }
    }

    override fun mostrarLista() {
        println("|-------------------------------------* Lista de Gr�os *--------------------------------")
        listaGraos.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento}Kg")
        }
        println("A quantidade de alimentos do tipo Gr�os a ser comprada � = ${listaGraos.size}")
    }
}
