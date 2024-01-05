package exercicios.introducao_java;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha 1 para converter Celsius para Fahrenheit e 2 para converter Fahrenheit para Celsius: ");
        int numero = entrada.nextInt();

        System.out.println("Digite a temperatura: ");
        double temperatura = entrada.nextDouble();

        double conversao;

        switch (numero) {
            case 1:
                conversao = (temperatura * 1.8) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + conversao);
                break;
            case 2:
                conversao = (temperatura - 32) / 1.8;
                System.out.println("A temperatura em Celsius é: " + conversao);
            default:
                break;
        }
    }
}
