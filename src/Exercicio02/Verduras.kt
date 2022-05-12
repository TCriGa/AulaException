package Exercicio02

class Verduras() : ListaDeCompras() {

    private val listaVerduras = mutableListOf<Verduras>()
    private var contador = 0
    private var newVerdura = 0

    fun inserirVerduras(): MutableList<Verduras> {
        try {

                println("Informe o nome da Verdura:")
                nomeAlimento = readln()

                println("Informe a quantidade em Kg:")
                qtdAlimento = readln().toDouble()
                contador++

                val adicionarListaVerdura = Verduras()
                adicionarListaVerdura.nomeAlimento = nomeAlimento
                adicionarListaVerdura.qtdAlimento = qtdAlimento
                listaVerduras.add(adicionarListaVerdura)


        } catch (ex: NumberFormatException) {
            println(ex.message)
        } catch (ex: UnsupportedOperationException) {
            println("Não é permitido inserir valor vazio")
        }
        adicionarMaisVerduras()
        return listaVerduras
    }

    private fun adicionarMaisVerduras() {

        println("Deseja inserir mais verduras? Digite 1- Sim/ 2- Não")
        newVerdura = readln().toInt()
        if (newVerdura == 1) {
            inserirVerduras()

        } else if (newVerdura == 2) {
            MenuListaCompras().opcaoMenu()
        } else if (newVerdura != 1 && newVerdura != 2) {
            println("Número inválido. Digite novamente")
            println("Deseja inserir mais verduras? Digite 1- Sim/ 2- Não")
            newVerdura = readln().toInt()
        }
    }


    override fun mostrarLista() {
        println("|-------------------------------------* Lista de verduras *--------------------------------")
        listaVerduras.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento}Kg")

        }
        println("A quantidade de alimentos do tipo verdura a ser comprada é = $contador")
    }
}



