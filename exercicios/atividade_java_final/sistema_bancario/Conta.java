package sistema_bancario;

public class Conta {

	protected String titular;
	protected double saldo;

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
	}

	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void transferir(Conta destino, double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			destino.depositar(valor);
			System.out.println(
					"Transferência de R$" + valor + " realizada para " + destino.titular + ". Novo saldo: R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente para a transferência.");
		}
	}
}