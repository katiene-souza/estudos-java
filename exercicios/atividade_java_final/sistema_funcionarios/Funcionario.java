package sistema_funcionarios;

public abstract class Funcionario {

	private String nome;
	private Integer codigo;

	public Funcionario(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public abstract double calcSalario();
}