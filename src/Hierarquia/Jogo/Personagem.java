package Hierarquia.Jogo;

import javax.swing.text.Style;

public class Personagem {

    private String nome;
    String tipoArma;
    int vida;
    int dano;


    Personagem(String nome, String tipoArma, int vida, int dano) {
        this.nome = nome;
        this.tipoArma = tipoArma;
        this.vida = vida;
        this.dano = dano;
    }

    public void atacar() {
        if(this.nome.equals("guerreiro")) {
            Guerreiro.guerreiroAtacar();
        }
        else if(this.nome.equals("mago")) {
            Mago.magoAtacar();
        }
        else if(this.nome.equals("arqueiro")) {
            Arqueiro.arqueiroAtacar();
        }
        System.out.println("Atacando....");
    }

    public String getNome() {
        return nome;
    }

}
