class ContaPoupanca(cliente: Cliente?) : Conta(cliente!!) {
    override fun imprimirExtrato() {
        println("=== Extrato Conta Poupança ===")
        super.imprimirInfosComuns()
    }
}