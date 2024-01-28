package sistema_veiculos;

public class Moto extends VeiculoBase {

	private double consumoCombustivel;

	public Moto(String modelo, String cor, int ano, double consumoCombustivel) {
		super(modelo, cor, ano);
		this.consumoCombustivel = consumoCombustivel;
	}

	public void acelerar() {
		System.out.println("Moto acelerando...");
	}

	public void frear() {
		System.out.println("Moto freando...");
	}

	public double calcCombustivel() {
		return consumoCombustivel;
	}
}
