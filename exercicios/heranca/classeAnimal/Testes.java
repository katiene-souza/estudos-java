package heranca.classeAnimal;

public class Testes {

	public static void main(String[] args) {
		Gato gato1 = new Gato("Saturno", "Gato Persa", 2);
		System.out.println(gato1.nome);
		System.out.println(gato1.raca);
		System.out.println(gato1.idade);
		gato1.som();
		
		Cachorro cachorro1 = new Cachorro("Amora", "Pinscher", 6);
		System.out.println(cachorro1.nome);
		System.out.println(cachorro1.raca);
		System.out.println(cachorro1.idade);
		cachorro1.som();
	}

}
