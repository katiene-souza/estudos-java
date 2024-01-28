package sistema_bancario;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(String titular, double saldo, double limite) {
		super(titular, saldo);
		this.limite = limite;
	}

	public void sacar(double valor) {
		if (valor <= saldo + limite) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
		} else {
			System.out.println("Saldo + Limite insuficiente.");
		}
	}
}
