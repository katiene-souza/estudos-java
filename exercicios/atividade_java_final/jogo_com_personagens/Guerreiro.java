package jogo_com_personagens;

public class Guerreiro extends Personagem {

	public Guerreiro(String nome, Integer vida) {
		super(nome, vida);
	}

	public void atacar() {
		System.out.println(getNome() + " desferiu um golpe de espada!");
	}

	public void defender() {
		System.out.println(getNome() + " levantou o escudo para se proteger!");
	}

	public void usarHabilidadeEspecial() {
		System.out.println(getNome() + " executou uma investida poderosa!");
	}
}