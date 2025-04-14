package Hierarquia.Jogo;

public class Mago extends Personagem{

    Mago(String nome, String tipoArma, int vida, int dano) {
        super(nome, tipoArma, vida, dano);
    }

    @Override
    public void atacar() {
        System.out.println("Mago atacando " + this.tipoArma);
    }

    @Override
    public void sofrerDano(int dano) {
        super.sofrerDano(dano);
    }

}
