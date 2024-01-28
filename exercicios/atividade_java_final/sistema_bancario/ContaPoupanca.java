package sistema_bancario;

public class ContaPoupanca extends Conta {

	private double taxaJuros;

	public ContaPoupanca(String titular, double saldo, double taxaJuros) {
		super(titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public void calcularJuros() {
		double juros = saldo * taxaJuros;
		saldo += juros;
		System.out.println("Juros de R$" + juros + " aplicados. Novo saldo: R$" + saldo);
	}
}