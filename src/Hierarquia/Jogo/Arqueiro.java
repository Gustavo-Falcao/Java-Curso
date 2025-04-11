package Hierarquia.Jogo;

public class Arqueiro extends Personagem {

    Arqueiro(String nome, String tipoArma, int vida, int dano) {
        super(nome, tipoArma, vida, dano);
    }
    public static void arqueiroAtacar(String nome){

        System.out.print("🎯");
    }
}
