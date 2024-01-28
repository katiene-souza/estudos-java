package sistema_figura_geometrica;

public class Circulo implements Forma {

	private Double raio;
	
	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public double CalcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}
}
