package heranca.classePessoa;

public class Estudante extends Pessoa {
	public int codigoAluno;
	public String salaDeAula;

	public Estudante() {
		super();
		this.codigoAluno = 0;
		this.salaDeAula = "";
	}

	public Estudante(String nome, String sobrenome, int idade, int codigoAluno, String salaDeAula) {
		super(nome, sobrenome, idade);
		this.codigoAluno = codigoAluno;
		this.salaDeAula = salaDeAula;
	}

}
