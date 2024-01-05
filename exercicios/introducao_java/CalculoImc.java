package exercicios.introducao_java;

import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("A altura digitada foi: " + altura);

        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();
        System.out.println("O peso digitado foi: " + peso);

        double imc = peso / (altura * altura);
        System.out.println("O seu IMC é: " + imc);
        
        if(imc < 17) {
            System.out.println("Muito abaixo do peso!");
        }else if (imc >= 17 && imc <= 18.49) {
            System.out.println("Abaixo do peso!");
        } else if (imc >= 18.50 && imc <= 24.99) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc  >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II (severa)");
        } else {
            System.out.println("Obesidade III (mórbida)");
        }
    }
}
