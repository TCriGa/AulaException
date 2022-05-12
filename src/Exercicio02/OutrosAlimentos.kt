package Exercicio02

class OutrosAlimentos :ListaDeCompras(){
    private val listaOutrosAlimentos = mutableSetOf<OutrosAlimentos>()
    private var contador = 0
    private var newAlimentos = 0
    private var qtdOutrosAlimentos = 0

    fun inserirOutrosAlimentos(): MutableSet<OutrosAlimentos> {
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

            adicionarMaisLegumes()
        } catch (ex: NumberFormatException) {
            println(ex.message)
        }catch (ex:UnsupportedOperationException){
            println("Não é permitido inserir valor vazio")
        }
        return listaOutrosAlimentos
    }


    private fun adicionarMaisLegumes() {
        println("Deseja inserir mais Legumes? Digite 1- Sim/ 2- Não")
        newAlimentos = readln().toInt()
        if (newAlimentos == 1) {
            inserirOutrosAlimentos()

        } else if (newAlimentos == 2) {
            MenuListaCompras().menu()
        } else if (newAlimentos != 1 && newAlimentos != 2) {
            println("Número inválido. Digite novamente")
            println("Deseja inserir mais Legumes? Digite 1- Sim/ 2- Não")
            newAlimentos = readln().toInt()
        }
    }

    override fun mostrarLista() {
        println("|-------------------------------------* Lista de Legumes *--------------------------------")
        listaOutrosAlimentos.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento} unidade")
        }
        println("A quantidade de alimentos do tipo legumes a ser comprada é = $contador")
    }
}
