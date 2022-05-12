package Exercicio02

class Legumes() : ListaDeCompras() {
    private val listaLegumes = mutableSetOf<Legumes>()
    private var contador = 0
    private var newLegumes = 0
    private var qtdLegumes: Int = 0

    fun inserirLegumes(): MutableSet<Legumes> {
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

            adicionarMaisLegumes()
        } catch (ex: NumberFormatException) {
            println(ex.message)
        }catch (ex:UnsupportedOperationException){
            println("Não é permitido inserir valor vazio")
        }
        return listaLegumes
    }


    private fun adicionarMaisLegumes() {
        println("Deseja inserir mais Legumes? Digite 1- Sim/ 2- Não")
        newLegumes = readln().toInt()
        if (newLegumes == 1) {
            inserirLegumes()

        } else if (newLegumes == 2) {
           MenuListaCompras().opcaoMenu()
        } else if (newLegumes != 1 && newLegumes != 2) {
            println("Número inválido. Digite novamente")
            println("Deseja inserir mais Legumes? Digite 1- Sim/ 2- Não")
            newLegumes = readln().toInt()
        }
    }

    override fun mostrarLista() {
        println("|-------------------------------------* Lista de Legumes *--------------------------------")
        listaLegumes.forEach {
            println("${it.nomeAlimento} -> ${it.qtdLegumes} unidade")
        }
        println("A quantidade de alimentos do tipo legumes a ser comprada é = $contador")
    }
}

