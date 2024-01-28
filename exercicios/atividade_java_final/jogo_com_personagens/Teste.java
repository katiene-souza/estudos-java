package jogo_com_personagens;

public class Teste {
	public static void main(String[] args) {

		Personagem mago = new Mago("Merlin", 110);
		Personagem guerreiro = new Guerreiro("Arthur", 130);
		Personagem arqueiro = new Arqueiro("Robin Hood", 85);

		realizarAcao(mago);
		realizarAcao(guerreiro);
		realizarAcao(arqueiro);

		System.out.println("Ações:");
		System.out.println("Ações de " + personagem.getNome() + ":");
		personagem.atacar();
		personagem.defender();
		personagem.usarHabilidadeEspecial();
		System.out.println("Vida restante: " + personagem.getVida());
	}
}
