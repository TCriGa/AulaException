package Exercicio02

class Legumes() : ListaDeCompras() {
    private val listaLegumes = mutableSetOf<Legumes>()
    private var contador = 0

    override fun inserirAlimento() {
        try {
            println("Informe o nome do Legume:")
            nomeAlimento = readln()

            println("Informe a quantidade em Kg:")
            qtdLegumes = readln().toInt()
            contador++

            val adicionarListaLegumes = Legumes()
            adicionarListaLegumes.nomeAlimento = nomeAlimento
            adicionarListaLegumes.qtdLegumes = qtdLegumes
            listaLegumes.add(adicionarListaLegumes)

        } catch (ex: NumberFormatException) {
            println("Para legume, a quantidade deve ser informada em unidades inteiras")
        } catch (ex: UnsupportedOperationException) {
            println("Não é permitido inserir valor vazio")
        }
    }

    override fun validarQtdAlimentos() {
        TODO("Not yet implemented")
    }


    override fun mostrarLista() {
        println("|-------------------------------------* Lista de Legumes *--------------------------------")
        listaLegumes.forEach {
            println("${it.nomeAlimento} -> ${it.qtdLegumes} unidade")
        }
        println("A quantidade de alimentos do tipo legumes a ser comprada é = $contador")
    }
}

