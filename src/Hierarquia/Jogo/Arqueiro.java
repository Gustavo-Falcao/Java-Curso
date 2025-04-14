package Hierarquia.Jogo;

public class Arqueiro extends Personagem {

    Arqueiro(String nome, String tipoArma, int vida, int dano) {
        super(nome, tipoArma, vida, dano);
    }

    @Override
    public void atacar(){
        System.out.println("Arqueiro atacando " + tipoArma);
    }

    @Override
    public void sofrerDano(int dano) {
        super.sofrerDano(dano);
    }
}
