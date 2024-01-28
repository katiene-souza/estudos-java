package sistema_funcionarios;

public class FuncionarioAssalariado extends Funcionario {

	private Double salarioMensal;
	private Integer diasTrabalhados;
	private static final Integer DIAS_UTEIS_NO_MES = 30;

	public FuncionarioAssalariado(String nome, Integer codigo, Double salarioMensal, Integer diasTrabalhados) {
		super(nome, codigo);
		this.salarioMensal = salarioMensal;
		this.diasTrabalhados = diasTrabalhados;
	}

	public Double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(Double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public double calcSalario() {
		return (salarioMensal / DIAS_UTEIS_NO_MES) * diasTrabalhados;
	}

	public String toString() {
		return "FuncionarioAssalariado [Nome= " + getNome() + ", codigo = " + getCodigo() + ", salarioMensal= "
				+ salarioMensal + ", diasTrabalhados = " + diasTrabalhados + "]";
	}

}
