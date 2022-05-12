package Exercicio02

class Verduras() : ListaDeCompras() {

    private val listaVerduras = mutableListOf<Verduras>()


    override fun inserirAlimento() {
        try {

            println("Informe o nome da Verdura:")
            nomeAlimento = readln()

            println("Informe a quantidade em Kg:")
            qtdAlimento = readln().toDoubleOrNull() ?: throw NumberFormatException()
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
                println("Alimento Registrado com sucesso")
                val adicionarListaVerdura = Verduras()
                adicionarListaVerdura.nomeAlimento = nomeAlimento
                adicionarListaVerdura.qtdAlimento = qtdAlimento
                listaVerduras.add(adicionarListaVerdura)

            }
        }

    }

    override fun mostrarLista() {
        println("|-------------------------------------* Lista de verduras *--------------------------------")
        listaVerduras.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento}Kg")

        }
        println("A quantidade de alimentos do tipo verdura a ser comprada é = ${listaVerduras.size}")
    }

}



