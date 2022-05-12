package Exercicio02

class Graos :ListaDeCompras(){
    private val listaGraos = mutableListOf<Graos>()
    private var contador = 0
    private var newGraos = 0

    fun inserirGraos(): MutableList<Graos> {
        try {
            println("Informe o nome do gr�o:")
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
            println("N�o � permitido inserir valor vazio")
        }
        adicionarMaisVerduras()
        return listaGraos
    }

    private fun adicionarMaisVerduras() {
        println("Deseja inserir mais Gr�os? Digite 1- Sim/ 2- N�o")
        newGraos = readln().toInt()
        if (newGraos == 1) {
            inserirGraos()

        } else if (newGraos == 2) {
            MenuListaCompras().menu()
        } else if (newGraos != 1 && newGraos != 2) {
            println("N�mero inv�lido. Digite novamente")
            println("Deseja inserir mais verduras? Digite 1- Sim/ 2- N�o")
            newGraos = readln().toInt()
        }
    }


    override fun mostrarLista() {
        println("|-------------------------------------* Lista de verduras *--------------------------------")
        listaGraos.forEach {
            println("${it.nomeAlimento} -> ${it.qtdAlimento}Kg")
        }
        println("A quantidade de alimentos do tipo Gr�os a ser comprada � = $contador")
    }
}
