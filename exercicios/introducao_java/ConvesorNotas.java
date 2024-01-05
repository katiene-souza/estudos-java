package exercicios.introducao_java;

import java.util.Scanner;

public class ConvesorNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 100: "); 
        double nota = entrada.nextDouble();
        System.out.println("A nota digitada foi: " + nota);

        if (nota >= 90 && nota < 100) {
            System.out.println("Sua nota convertida é: A");
        } else if (nota >= 80 && nota < 86) {
            System.out.println("Sua nota convertida é: B");
        } else if(nota >= 70 && nota < 79) {
            System.out.println("Sua nota convertida é: C");
        } else if (nota >= 60 && nota < 69) {
            System.out.println("Sua nota convertida é: D");
        } else if (nota < 60) {
            System.out.println("Sua nota convertida é: F");
        } else {
           System.out.println("Informe uma nota válido!"); 
        }
     }
}
