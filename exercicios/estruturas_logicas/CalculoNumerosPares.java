package exercicios.estruturas_logicas;

import java.util.Scanner;

public class CalculoNumerosPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = entrada.nextInt();
        System.out.println("O número digitado foi: " + numero);
        
        int resultado = 0;

        for(int i = 0; i <= numero; i+= 2) {
            resultado += i;       
        }

        System.out.println(resultado);
    }
}
