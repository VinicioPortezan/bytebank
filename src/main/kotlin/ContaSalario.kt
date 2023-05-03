class ContaSalario(
    titular: String,
    numero: Int
):Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double){
        if (saldo >= valor){
            saldo -= valor
        }
    }

}