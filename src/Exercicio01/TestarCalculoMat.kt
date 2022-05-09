package Exercicio01

class TestarCalculoMat:CalculoMatematico() {

    override fun dividir(num1: Int, num2: Int): Int {
        var num1 = num1
        var num2 = num2
        var divisao = 0
       try {
           println("Informe o 1º número:")
           num1 = readln().toInt()

           println("Informe o 2º número ")
           num2 = readln().toInt()

           divisao= num1/num2
           println("A divisão é = $divisao")

       } catch (ex:ArithmeticException){
          println( ex.message)
           println("Operação inválida.")
       }

        return divisao
    }
}