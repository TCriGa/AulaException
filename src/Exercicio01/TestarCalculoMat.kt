package Exercicio01

class TestarCalculoMat:CalculoMatematico() {

    override fun dividir(num1: Int, num2: Int): Int {
        var num1 = num1
        var num2 = num2
        var divisao = 0
       try {
           println("Informe o 1� n�mero:")
           num1 = readln().toInt()

           println("Informe o 2� n�mero ")
           num2 = readln().toInt()

           divisao= num1/num2
           println("A divis�o � = $divisao")

       } catch (ex:ArithmeticException){
          println( ex.message)
           println("Opera��o inv�lida.")
       }

        return divisao
    }
}