fun main() {
    println("Bem vindo ao Bytebank ")
    println()
    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)
    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)
    println()
    println("Sacando da conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)
    println("Sacando da conta da Fran")
    contaFran.saca(50.0)
    println(contaFran.saldo)
    println()
    println("Transferência da conta da Fran para Alex")

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na tranferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)

}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}


/*fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroX $numeroY")

    var contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"

    println("Titular da conta: ${contaJoao.titular}")
    println("Titular da conta: ${contaMaria.titular}")
    println(contaJoao)
    println(contaMaria)

}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Vinicio $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo Positivo")
        saldo == 0.0 -> println("Saldo neutro")
        else -> println("Saldo Negativo")
    }

}*/
