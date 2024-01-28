package sistema_funcionarios;

public class Teste {
	public static void main(String[] args) {

		FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Carlos", 101, 6000.0, 30);
		FuncionarioHora porHora = new FuncionarioHora("Ana", 205, 25.0, 35);

		System.out.println(assalariado);
		System.out.println("Salario Final: " + String.format("%.2f", assalariado.calcSalario()));
		System.out.println(porHora);
		System.out.println("Salario Final: " + String.format("%.2f", porHora.calcSalario()));
	}
}
