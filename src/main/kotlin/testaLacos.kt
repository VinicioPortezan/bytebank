fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Vinicio $i"
        val numeroConta: Int = 1000 + i
        val saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }
}
