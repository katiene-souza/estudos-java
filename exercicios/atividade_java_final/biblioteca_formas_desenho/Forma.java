package biblioteca_formas_desenho;

interface Forma {

	void desenhar();

	void mover(int deltaX, int deltaY);

	void redimensionar(double fator);

}