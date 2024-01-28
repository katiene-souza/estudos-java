package sistema_veiculos;

public class Teste {
	public static void main(String[] args) {

		VeiculoBase carro = new Carro("Civic", "Prata", 2018, 15.0);
		VeiculoBase moto = new Moto("Yamaha", "Azul", 2022, 20.5);
		VeiculoBase bicicleta = new Bicicleta("Specialized", "Preta", 2021);

		realizarAcoes(carro);
		realizarAcoes(moto);
		realizarAcoes(bicicleta);

		System.out.println("Ações:");
		System.out.println(veiculo.getModelo());
		System.out.println(veiculo.getCor());
		System.out.println(veiculo.getAno());
		veiculo.acelerar();
		veiculo.frear();
		
		System.out.println("Consumo de Combustível: " + veiculo.calcCombustivel() + " litros/km");
	}
}
