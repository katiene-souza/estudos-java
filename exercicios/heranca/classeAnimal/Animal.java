package heranca.classeAnimal;

public class Animal {
	public String nome;
	public String raca;
	public int idade;
	
	public Animal(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	public void som() {
		System.out.println("Esse animal está emitindo um som");
	}
}
