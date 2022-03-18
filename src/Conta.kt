abstract class Conta(cliente: Cliente) : IConta {
    var agencia: Int
        protected set
    var numero: Int
        protected set
    var saldo = 0.0
    var cliente: Cliente

    init {
        agencia = AGENCIA_PADRAO
        numero = SEQUENCIAL++
        this.cliente = cliente
    }

    override fun sacar(valor: Double) {
        saldo -= valor
    }

    override fun depositar(valor: Double) {
        saldo += valor
    }

    override fun transferir(valor: Double, contaDestino: IConta?) {
        sacar(valor)
        contaDestino!!.depositar(valor)
    }

    protected fun imprimirInfosComuns() {
        println(java.lang.String.format("Titular: %s", cliente.nome ))
        println(String.format("Agencia: %d", agencia))
        println(String.format("Numero: %d", numero))
        println(String.format("Saldo: %.2f", saldo))
    }

    companion object {
        private const val AGENCIA_PADRAO = 1
        private var SEQUENCIAL = 1
    }
}