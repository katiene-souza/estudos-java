package sistema_veiculos;

public class Bicicleta extends VeiculoBase {

	public Bicicleta(String modelo, String cor, int ano) {
		super(modelo, cor, ano);
	}

	public void acelerar() {
		System.out.println("Pedalando mais rápido...");
	}

	public void frear() {
		System.out.println("Freando a bicicleta...");
	}

	public double calcCombustivel() {
		return 0;
	}
}
