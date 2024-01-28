package loja_online;

public class Teste {
	public static void main(String[] args) {

		ProdutoEletronico celular = new ProdutoEletronico("iPhone 13", 5000.0, "Apple");
		ProdutoRoupa camisa = new ProdutoRoupa("Camiseta Vintage", 35.0, "L");
		ProdutoLivro livro = new ProdutoLivro("A Revolução dos Bichos", 60.0, "George Orwell");
		
		System.out.println("Detalhes do Produto:");
		exibirDetalhesProduto(celular);
		exibirDetalhesProduto(camisa);
		exibirDetalhesProduto(livro);
	}
}
