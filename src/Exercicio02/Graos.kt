package Exercicio02

class Graos :ListaDeCompras(){
    private val listaGraos = mutableListOf<Graos>()
    private var contador = 0
    private var newGraos = 0

    fun inserirGraos(): MutableList<Graos> {
        try {
            println("Informe o nome do grão:")
            nomeAlimento = readln()

            println("Informe a quantidade em Kg:")
            qtdAlimento = readln().toDouble()
            contador++

            val adicionarListaGraos = Graos()
            adicionarListaGraos.nomeAlimento = nomeAlimento
            adicionarListaGraos.qtdAlimento = qtdAlimento
            listaGraos.add(adicionarListaGraos)


        } catch (ex: NumberFormatException) {
            println(ex.message)
        }catch (ex:UnsupportedOperationException){
            println("Não é permitido inserir valor vazio")
        }
        adicionarMaisVerduras()
        return listaGraos
    }

    private fun adicionarMaisVerduras() {
        println("Deseja inserir mais Grãos? Digite 1- Sim/ 2- Não")
        newGraos = readln().toInt()
        if (newGraos == 1) {
            inserirGraos()

        } else if (newGraos == 2) {
            MenuListaCompras().menu()
        } else if (newGraos != 1 && newGraos != 2) {
            println("Número inválido. Digite novamente")
            println("Deseja inserir mais verduras? Digite 1- Sim/ 2- Não")
            newGraos = readln().toInt()
        }
    }


    override fun mostrarLista() {
        println("|-------------------------------------* Lista de verduras *--------------------------------")
        listaGraos.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento}Kg")
        }
        println("A quantidade de alimentos do tipo Grãos a ser comprada é = $contador")
    }
}
