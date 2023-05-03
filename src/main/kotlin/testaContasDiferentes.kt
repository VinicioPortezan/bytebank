fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )
    val contaSalario = ContaSalario(
        titular = "Manoel",
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(5000.0)

    println("Saldo Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("Saldo Conta Salário: ${contaSalario.saldo}")
    println()

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(1000.0)

    println("Saldo Conta Corrente após o saque: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após o saque: ${contaPoupanca.saldo}")
    println("Saldo Conta Salário após o saque: ${contaSalario.saldo}")
    println()

    contaCorrente.transfere(600.0, contaPoupanca)
    println("Saldo Conta Corrente após transferir para Conta Poupança: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após receber transferência: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transfere(200.0, contaCorrente)
    println("Saldo Conta Corrente após receber transferência: ${contaCorrente.saldo}")
    println("Saldo Conta Poupança após transferir para Conta Corrente: ${contaPoupanca.saldo}")

}