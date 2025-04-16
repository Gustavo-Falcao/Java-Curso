package Hierarquia.Jogo;


public class Personagem {

    private String nome;
    String tipoArma;
    private int vida;
    private int dano;


    Personagem(String nome, String tipoArma, int vida, int dano) {
        this.nome = nome;
        this.tipoArma = tipoArma;
        this.vida = vida;
        this.dano = dano;
    }

    public void atacar() {
        System.out.println("Atacando....");
    }

    public void sofrerDano(int dano) {
        if(this.vida > 0 && dano > this.vida) {
            this.vida = 0;
        }
        else if(this.vida > 0) {
            this.vida -= dano;
        } else {
            System.out.println("O " + this.nome + " já está morto!!");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getDano(){
        return dano;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo de arma: " + tipoArma);
        System.out.println("Vida: " + getVida());
        System.out.println("Dano: " + getDano());
    }

    public int getVida() {
        return vida;
    }

}
