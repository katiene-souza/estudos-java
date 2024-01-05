package exercicios.introducao_java;

import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o preço de um produto: ");
        double preco = entrada.nextDouble();
        System.out.println("O preço digitado foi: " + preco);

        System.out.println("Digite a porcentagem de desconto: ");
        double porcentagem = entrada.nextDouble() / 100;
        System.out.println("A porcentagem aplicada foi de: " + porcentagem);

        double precoFinal = preco - (porcentagem * preco);
        System.out.println("O preço com o desconto aplicado é: " + precoFinal);
    }
}
