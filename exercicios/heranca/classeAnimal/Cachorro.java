package heranca.classeAnimal;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}
	
	public void som() {
		System.out.println("au au");
	}
}
