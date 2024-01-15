package heranca.classeVeiculo;

public class Barco extends Veiculo {
	public String tipo;
	public String quantidadeDePassageiros;
	 
	public Barco(String modelo, int ano, String tipo, String quantidadeDePassageiros) {
		super(modelo, ano);
		this.tipo = tipo;
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}

}
