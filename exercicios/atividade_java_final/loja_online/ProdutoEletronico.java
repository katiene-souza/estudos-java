package loja_online;

public class ProdutoEletronico implements Produto {

	private String nome;
	private double preco;
	private String marca;

	public ProdutoEletronico(String nome, double preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}

	public String getDescricao() {
		return nome + " - " + marca;
	}

	public double calcularPreco() {
		return preco;
	}
}
