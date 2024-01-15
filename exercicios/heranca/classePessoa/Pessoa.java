package heranca.classePessoa;

public class Pessoa {
	public String nome;
	public String sobrenome;
	public int idade;

	public Pessoa() {
		this.nome = "Desconhecido";
		this.sobrenome = "";
		this.idade = 0;
	}

	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

}
