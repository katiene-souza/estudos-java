package sistema_bancario;

public class Teste {
	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaCorrente("João", 500.00, 1000.00);
		ContaBancaria conta2 = new ContaPoupanca("Maria", 1000.00, 0.03);

		conta1.depositar(200.00);
		conta1.sacar(700.00);

		conta2.depositar(500.00);
		((ContaPoupanca) conta2).calcularJuros();

		conta1.transferir(conta2, 300.00);
	}
}
