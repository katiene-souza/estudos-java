package exercicios.estruturas_logicas;

import java.util.Scanner;
import java.util.Random;

public class AdvinheNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        int numeroSecretro = gerador.nextInt(1000);

        System.out.println("Você só têm 6 chances para adivinhar o número!" + numeroSecretro);

        int chances = 5;

        for(int i = 1; i <= 6; i++) {
            System.out.println("Chute um número (1 a 1000):");
            int chute = entrada.nextInt();

            if(chute > numeroSecretro) {
                System.out.println("O número é menor que " + chute);
            } else if (chute < numeroSecretro) {
                System.out.println("O número é maior que " + chute);
            } else {
                System.out.println("Parabéns!! Você acertou, o número correto era: " + numeroSecretro);
                break;
            }

            System.out.println("Você só tem " + chances-- + " chances");
        }
    }
}
