package sistema_figura_geometrica;

public class Teste {
	public static void main(String[] args) {

		Forma c1 = new Circulo(4.2);
		Forma r1 = new Retangulo(3.0, 9.5);
		Forma t1 = new Triangulo(6.8, 5.5);
		
		System.out.println(String.format("%.2f", c1.calcularArea()));
		System.out.println(String.format("%.2f", r1.calcularArea()));
		System.out.println(String.format("%.2f", t1.calcularArea()));

	}
}
