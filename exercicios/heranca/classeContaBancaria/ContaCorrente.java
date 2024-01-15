package heranca.classeContaBancaria;

public class ContaCorrente extends ContaBancaria {
	public int limiteSaque;

	public ContaCorrente(int saldo, int limiteSaque) {
		super(saldo);
		this.limiteSaque = limiteSaque;
	}

	public void saque(double valorSaque) {
		try {
			if (valorSaque <= limiteSaque && valorSaque <= saldo) {
				double resultado = saldo - valorSaque;
				System.out.print("Saque no valor de " + valorSaque + " realizado, seu saldo agora é de: " + resultado);
			} else {
				throw new RuntimeException("Saque inválido. Verifique o valor ou o limite de saque.");
			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
