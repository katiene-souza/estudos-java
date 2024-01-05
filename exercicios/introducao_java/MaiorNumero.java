package exercicios.introducao_java;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numeroUm = entrada.nextDouble();
        System.out.println("O número digitado foi: " + numeroUm);

        System.out.println("Digite o segundo número: ");
        double numeroDois = entrada.nextDouble();
        System.out.println("O número digitado foi: " + numeroDois);

        System.out.println("Digite o terceiro número: ");
        double numeroTres= entrada.nextDouble();
        System.out.println("O número digitado foi: " + numeroTres);

        double numeroMaior = Math.max(Math.max(numeroUm, numeroDois), numeroTres);

        System.out.println("O número maior é: " + numeroMaior);
    }
}
