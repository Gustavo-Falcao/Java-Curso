package Hierarquia.Jogo;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);
    public static String ataquePersonagem() {
        System.out.println("Quem vai bater: ");
        return ler.nextLine();
    }

    public static void main(String[] args) {
        ArrayList<Personagem> personagems = new ArrayList<>();

        Guerreiro ger = new Guerreiro("guerreiro", "🪓", 1000, 250);
        Arqueiro arq = new Arqueiro("arqueiro", "🎯", 1000, 150);
        Mago mag = new Mago("mago", "🤖", 1000, 200);


        int opcao;
        do {
            System.out.println("Personagens");
            System.out.println("[1] arqueiro");
            System.out.println("[2] guerreiro");
            System.out.println("[3] mago");
            System.out.println("Quem vai jogar: ");
            opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println(" << -- Arqueiro -- >> ");
                    String nome = ataquePersonagem();
                    boolean igual = false;
                    for(Personagem per : personagems) {
                       if(per.getNome().equals(nome)) {
                           igual = true;
                       }
                    }
                    if(igual) {
                        arq.atacar(nome);
                    }

            }
        }

        personagems.add(ger);
        personagems.add(arq);
        personagems.add(mag);

        for(Personagem per : personagems) {
            per.atacar();
        }
    }
}
