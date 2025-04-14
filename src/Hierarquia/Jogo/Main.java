package Hierarquia.Jogo;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    static ArrayList<Personagem> personagens = new ArrayList<>();

    static Scanner ler = new Scanner(System.in);

    public static int pegarPlayerAtaque() {
        System.out.print("Quem vai atacar: ");
        return Integer.parseInt(ler.nextLine());
    }

    public static int pegarPlayerVitima() {
        System.out.print("Quem vai receber o ataque: ");
        return Integer.parseInt(ler.nextLine());
    }

    public static void mostrarOpcoes() {
        System.out.println("\n-------------------------");
        System.out.println("| <<-- Personagens -->> |");
        System.out.println("|     [1] Arqueiro      |");
        System.out.println("|     [2] Guerreiro     |");
        System.out.println("|     [3] Mago          |");
        System.out.println("|     [0] Sair          |");
        System.out.println("-------------------------");
    }

    public static int pegarPosicaoPersonagem(String nomePersonagem) {
        for(Personagem per : personagens) {
            if(per.getNome().equalsIgnoreCase(nomePersonagem)) {
                return personagens.indexOf(per);
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        personagens.add(new Guerreiro("Guerreiro", "🪓", 1000, 250));
        personagens.add(new Arqueiro("Arqueiro", "🎯", 1000, 500));
        personagens.add(new Mago("Mago", "🤖", 1000, 200));

        int opcao;
        do {
            System.out.println("\n");
            for(Personagem per : personagens) {
                per.mostrarInfo();
                System.out.println();
            }
            mostrarOpcoes();
            opcao = pegarPlayerAtaque();
            int op;
            switch (opcao) {
                case 1:
                    System.out.println("\n\n << -- Arqueiro -- >> ");
                    System.out.println(" [1] Guerreiro");
                    System.out.println(" [2] Mago");
                    op = pegarPlayerVitima();
                    if(op == 1) {
                        if(pegarPosicaoPersonagem("Guerreiro") != -1) {
                            personagens.get(pegarPosicaoPersonagem("Guerreiro")).sofrerDano(personagens.get(pegarPosicaoPersonagem("Arqueiro")).getDano());
                        }
                    }
                    else if(op == 2) {
                        if(pegarPosicaoPersonagem("Mago") != -1) {
                            personagens.get(pegarPosicaoPersonagem("Mago")).sofrerDano(personagens.get(pegarPosicaoPersonagem("Arqueiro")).getDano());
                        }
                    }
                break;
                case 2:
                    System.out.println("\n\n << -- Guerreiro -- >>");
                    System.out.println(" [1] Arqueiro");
                    System.out.println(" [2] Mago");
                    op = pegarPlayerVitima();
                    if(op == 1) {
                        if(pegarPosicaoPersonagem("Arqueiro") != -1) {
                            personagens.get(pegarPosicaoPersonagem("Arqueiro")).sofrerDano(personagens.get(pegarPosicaoPersonagem("Guerreiro")).getDano());
                        }
                    }
                    else if(op == 2) {
                        if(pegarPosicaoPersonagem("Mago") != -1) {
                            personagens.get(pegarPosicaoPersonagem("Mago")).sofrerDano(personagens.get(pegarPosicaoPersonagem("Guerreiro")).getDano());
                        }
                    }
                break;
                case 3:
                    System.out.println("\n\n << -- Mago -- >>");
                    System.out.println(" [1] Arqueiro");
                    System.out.println(" [2] Guerreiro");
                    op = pegarPlayerVitima();
                    if(op == 1) {
                        if(pegarPosicaoPersonagem("Arqueiro") != -1) {
                            personagens.get(pegarPosicaoPersonagem("Arqueiro")).sofrerDano(personagens.get(pegarPosicaoPersonagem("Mago")).getDano());
                        }
                    }
                    else if(op == 2) {
                        if(pegarPosicaoPersonagem("Guerreiro") != -1) {
                            personagens.get(pegarPosicaoPersonagem("Guerreiro")).sofrerDano(personagens.get(pegarPosicaoPersonagem("Mago")).getDano());
                        }
                    }
                break;
                case 0: System.out.println("Saindo..."); break;
            }
        }while(opcao != 0);
        ler.close();
    }
}
