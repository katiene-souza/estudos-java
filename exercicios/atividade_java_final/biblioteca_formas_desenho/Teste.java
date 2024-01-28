package Atividade2;

import biblioteca_formas_desenho.Linha;
import sistema_figura_geometrica.Forma;

public class Teste {
	public static void main(String[] args) {

		FormaGeometrica retangulo = new Retangulo(5, 3);
		FormaGeometrica circulo = new Circulo(4);
		FormaGeometrica linha = new Linha(10);

		realizarOperacoes(retangulo);
		realizarOperacoes(circulo);
		realizarOperacoes(linha);

		System.out.println("Realizar operações:");
		forma.desenhar();
		forma.mover(2, 3);
		forma.redimensionar(1.5);
	}
}
