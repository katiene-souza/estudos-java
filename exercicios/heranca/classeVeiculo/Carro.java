package heranca.classeVeiculo;

public class Carro extends Veiculo {
	public String marca;
	public String cor;
	public boolean irNaManutencao;
	
	public Carro(String modelo, int ano, String marca, String cor, boolean irNaManutencao) {
		super(modelo, ano);
		this.marca = marca;
		this.cor = cor;
		this.irNaManutencao = irNaManutencao;
	}
}
