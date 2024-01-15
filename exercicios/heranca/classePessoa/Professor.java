package heranca.classePessoa;

public class Professor extends Pessoa {
	public String formacao;
	public String cpf;
	
	
	public Professor() {
		super();
		this.formacao = "";
		this.cpf = "";
	}
	
	public Professor(String nome, String sobrenome, int idade, String formacao, String cpf) {
		super(nome, sobrenome, idade);
		this.formacao = formacao;
		this.cpf = cpf;
	}

}
