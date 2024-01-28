package sistema_figura_geometrica;

public class Triangulo implements Forma {

	private Double base;
	private Double altura;

	public Triangulo(Double base, Double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public double CalcularArea() {
		return (base * altura) / 2;
	}

}
