package exercicios.introducao_java;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double resultado;

        System.out.println("Digite o primeiro número: "); 
        double numeroUm = entrada.nextDouble();
        System.out.println("O primeiro número digitado foi: " + numeroUm);

        System.out.println("Digite o segundo número: ");
        double numeroDois= entrada.nextDouble();
        System.out.println("O segundo número digitado foi: " + numeroDois);

        System.out.println("Escolha qual operação você quer fazer (soma, subtracao, multiplicacao ou divisao)");
        entrada.nextLine();
        String operacao = entrada.nextLine();
        System.out.println("A operação escolhida foi: " + operacao);

        switch (operacao) {
            case "soma":
                resultado = numeroUm + numeroDois;
                System.out.println("A soma é: " + resultado);
                break;
            case "subtracao":
                resultado = numeroUm - numeroDois;
                System.out.println("A subtração é: " + resultado);
                break;
            case "multiplicacao":
                resultado = numeroUm * numeroDois;
                System.out.println("A multiplicação é: " + resultado);
                break;
            case "divisao":
                resultado = numeroUm / numeroDois;
                System.out.println("A divisão é: " + resultado);
                break;
            default:
                System.out.println("Você digitou errado!");
                break;
        }
    }
}
