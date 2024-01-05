package exercicios.estruturas_logicas;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        System.out.println("O número digitado foi: " + numero);

        for(int i = 0; i < 10; i++) {
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }
}
