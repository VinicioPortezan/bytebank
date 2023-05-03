fun testaComportamentosConta() {
    val contaAlex = ContaCorrente("Alex", 1000)
    contaAlex.deposita(200.0)

    val contaFran = ContaPoupanca("Fran", 1001)
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