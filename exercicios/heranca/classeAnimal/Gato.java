package heranca.classeAnimal;

public class Gato extends Animal {
	
	public Gato(String nome, String raca, int idade) {
		super(nome, raca, idade);
		
	}
	
	public void som() {
		System.out.println("miau miau");
	}
	
}
