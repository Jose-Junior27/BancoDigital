object  Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val cliente = Cliente("Jose")
        val cc: Conta = ContaCorrente(cliente)
        val poupanca: Conta = ContaPoupanca(cliente)
        cc.depositar(100.0)
        cc.transferir(100.0, poupanca)
        cc.imprimirExtrato()
        poupanca.imprimirExtrato()
    }
}