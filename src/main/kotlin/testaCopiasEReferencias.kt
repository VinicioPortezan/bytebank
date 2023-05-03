fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroX $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    val contaMaria = ContaCorrente("Maria", 1003)


    println("Titular da conta: ${contaJoao.titular}")
    println("Titular da conta: ${contaMaria.titular}")
    println(contaJoao)
    println(contaMaria)

}
