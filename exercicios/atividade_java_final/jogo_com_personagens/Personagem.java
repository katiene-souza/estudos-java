package jogo_com_personagens;

abstract class Personagem {

	private String nome;
	private Integer vida;

	public Personagem(String nome, Integer vida) {
		this.nome = nome;
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public abstract void atacar();

	public abstract void defender();

	public abstract void usarHabilidadeEspecial();

}