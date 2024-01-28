package sistema_funcionarios;

public class FuncionarioHora extends Funcionario {

	private double salarioPorHora;
	private Integer horasTrabalhadas;

	public FuncionarioHora(String nome, Integer codigo, double salarioPorHora, Integer horasTrabalhadas) {
		super(nome, codigo);
		this.salarioPorHora = salarioPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double calcSalario() {
		return salarioPorHora * horasTrabalhadas;
	}

	public String toString() {
		return "FuncionarioPorHora [Nome= " + getNome() + ", codigo = " + getCodigo() + ", salarioMensal= "
				+ salarioPorHora + ", diasTrabalhados = " + horasTrabalhadas + "]";
	}
}
