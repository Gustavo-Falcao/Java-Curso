package Hierarquia.Jogo;

public class Guerreiro extends Personagem{

    Guerreiro(String nome, String tipoArma, int vida, int dano) {
        super(nome, tipoArma, vida, dano);
    }
    public static void guerreiroAtacar() {
        System.out.print("🪓");
    }

}
