interface IConta {
	fun sacar(valor: Double)
	fun depositar(valor: Double)
	fun transferir(valor: Double, contaDestino: IConta?)
	fun imprimirExtrato()
}