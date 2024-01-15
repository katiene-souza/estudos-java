package heranca.classePessoa;

public class Testes {
	public static void main(String[] args) {
		Estudante estudantePadrao = new Estudante();
		System.out.println("Pessoa Padrão: " + estudantePadrao.nome + " " + estudantePadrao.sobrenome + ", " + estudantePadrao.idade + " anos");
		
		Estudante estudante1 = new Estudante("Andre", "Luiz", 14, 2325, "Sala B");
		System.out.println(estudante1.nome);
		System.out.println(estudante1.sobrenome);
		System.out.println(estudante1.idade);
		System.out.println(estudante1.codigoAluno);
		System.out.println(estudante1.salaDeAula);

		Professor professor1 = new Professor("Marcos", "Santos", 32, "Geografia", "134.145.167-21");
		System.out.println(professor1.nome);
		System.out.println(professor1.sobrenome);
		System.out.println(professor1.idade);
		System.out.println(professor1.formacao);
		System.out.println(professor1.cpf);
	}
}
