package sistema_figura_geometrica;

public class Retangulo implements Forma {

	private Double largura;
	private Double comprimento;

	public Retangulo(Double largura, Double comprimento) {
		super();
		this.largura = largura;
		this.comprimento = comprimento;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double CalcularArea() {
		return comprimento * largura;
	}

}
