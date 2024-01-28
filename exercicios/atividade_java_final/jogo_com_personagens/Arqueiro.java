package jogo_com_personagens;

public class Arqueiro extends Personagem {

	public Arqueiro(String nome, int vida) {
		super(nome, vida);
	}

	public void atacar() {
		System.out.println(getNome() + " disparou uma flecha precisa!");
	}

	public void defender() {
		System.out.println(getNome() + " se esquivou habilmente!");
	}

	public void usarHabilidadeEspecial() {
		System.out.println(getNome() + " realizou um tiro múltiplo!");
	}

}
