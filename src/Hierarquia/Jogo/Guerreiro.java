package Hierarquia.Jogo;

public class Guerreiro extends Personagem{

    Guerreiro(String nome, String tipoArma, int vida, int dano) {
        super(nome, tipoArma, vida, dano);
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro atacando " + this.tipoArma);
    }

    @Override
    public void sofrerDano(int dano) {
        super.sofrerDano(dano);
    }

}
