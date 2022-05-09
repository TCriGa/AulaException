package Exercicio01

abstract class CalculoMatematico {
    open fun dividir(num1: Int, num2:Int):Int{
        return num1 / num2
    }
}