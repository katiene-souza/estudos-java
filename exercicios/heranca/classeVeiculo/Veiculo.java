package heranca.classeVeiculo;

public class Veiculo {
	public String modelo;
	public int ano;
	

	public Veiculo(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
    public void mostrarDetalhes(String modelo, int ano, String cor) {
        System.out.println("Detalhes do Veículo - Informações Completas:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
}
