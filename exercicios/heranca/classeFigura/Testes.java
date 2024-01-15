package heranca.classeFigura;

public class Testes {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(5.0);
		Retangulo retangulo = new Retangulo(4.0, 6.0);

		System.out.printf("Área do círculo: %.2f%n", circulo.calcularArea());
		System.out.println("Área do retângulo: " + retangulo.calcularArea());
	}
}
