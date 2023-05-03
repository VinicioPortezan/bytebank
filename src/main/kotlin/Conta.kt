abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        saldo += valor
    }

    abstract fun saca(valor: Double)


}