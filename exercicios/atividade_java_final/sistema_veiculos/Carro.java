package sistema_veiculos;

public class Carro extends VeiculoBase {

	private double consumoCombustivel;

	public Carro(String modelo, String cor, int ano, double consumoCombustivel) {
		super(modelo, cor, ano);
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public void acelerar() {
		System.out.println("Carro acelerando...");
	}

	public void frear() {
		System.out.println("Carro freando...");
	}

	public double calcCombustivel() {
		return consumoCombustivel;
	}
}