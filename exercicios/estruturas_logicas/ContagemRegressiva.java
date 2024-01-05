package exercicios.estruturas_logicas;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        System.out.println("O número digitado foi: " + numero);

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }
    }
}
