package biblioteca_formas_desenho;

public class Linha implements Forma {

	private int comprimento;

	public Linha(int comprimento) {
		this.comprimento = comprimento;
	}

	public void desenhar() {
		System.out.println("Desenhando uma linha.");
	}

	public void mover(int deltaX, int deltaY) {
		System.out.println("Movendo a linha por (" + deltaX + ", " + deltaY + ").");
	}

	public void redimensionar(double fator) {
		comprimento *= fator;
		System.out.println("Redimensionando a linha para comprimento " + comprimento + ".");
	}
}
