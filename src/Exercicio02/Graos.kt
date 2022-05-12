package Exercicio02

class Graos : ListaDeCompras() {
    private val listaGraos = mutableListOf<Graos>()
    private var contador = 0

    override fun inserirAlimento() {
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
            println("Para grãos, a quantidade deve ser informada com ponto")
        } catch (ex: UnsupportedOperationException) {
            println("Não é permitido inserir valor vazio")
        }
    }

    override fun validarQtdAlimentos() {
        when (qtdAlimento < 0) {
            true -> {
                println("Quantidade negativa não permitido. Digite novamente")
                qtdAlimento = readln().toDoubleOrNull()?: throw NumberFormatException()
            }
            false -> println("Alimento registrado com sucesso")
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
