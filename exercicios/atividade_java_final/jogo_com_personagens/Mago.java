package jogo_com_personagens;

public class Mago extends Personagem {

	public Mago(String nome, Integer vida) {
		super(nome, vida);
	}

	public void atacar() {
		System.out.println(getNome() + " lançou uma bola de fogo!");
	}

	public void defender() {
		System.out.println(getNome() + " conjurou um escudo mágico!");
	}

	public void usarHabilidadeEspecial() {
		System.out.println(getNome() + " realizou um feitiço poderoso!");
	}
}
