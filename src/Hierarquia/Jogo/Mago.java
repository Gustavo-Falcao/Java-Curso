package Hierarquia.Jogo;

public class Mago extends Personagem{

    Mago(String nome, String tipoArma, int vida, int dano) {
        super(nome, tipoArma, vida, dano);
    }
    public static void magoAtacar() {
        System.out.print("🤖");

    }

}
