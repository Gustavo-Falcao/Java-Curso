package Hierarquia.Jogo;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

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


    public static void mostrarPersonagemMorto(String nome) {
        System.out.println("ERRO => [O " + nome + " está morto e não pode ser selecionado!!]");
    }

    public static void main(String[] args) {

        Personagem pGuerreiro = new Guerreiro("Guerreiro", "🪓", 1000, 250);
        Personagem pArqueiro = new Arqueiro("Arqueiro", "🎯", 1000, 500);
        Personagem pMago = new Mago("Mago", "🤖", 1000, 200);

        int opcao;
        do {
            System.out.println("\n");
            pGuerreiro.mostrarInfo();
            pArqueiro.mostrarInfo();
            pMago.mostrarInfo();
            mostrarOpcoes();
            opcao = pegarPlayerAtaque();
            int op;
            switch (opcao) {
                case 1:
                    if(pArqueiro.getVida() == 0) {
                        mostrarPersonagemMorto(pArqueiro.getNome());
                    } else {
                        System.out.println("\n\n << -- Arqueiro -- >> ");
                        System.out.println(" [1] Guerreiro");
                        System.out.println(" [2] Mago");
                        op = pegarPlayerVitima();
                        if(op == 1) {
                            pGuerreiro.sofrerDano(pArqueiro.getDano());
                        }
                        else if(op == 2) {
                            pMago.sofrerDano(pArqueiro.getDano());
                        }
                        else {
                            System.out.println("Opção inválida");
                        }
                    }
                break;
                case 2:
                    if(pGuerreiro.getVida() == 0) {
                        mostrarPersonagemMorto(pGuerreiro.getNome());
                    } else {
                        System.out.println("\n\n << -- Guerreiro -- >>");
                        System.out.println(" [1] Arqueiro");
                        System.out.println(" [2] Mago");
                        op = pegarPlayerVitima();
                        if(op == 1) {
                            pArqueiro.sofrerDano(pGuerreiro.getDano());
                        }
                        else if(op == 2) {
                            pMago.sofrerDano(pGuerreiro.getDano());
                        }
                        else {
                            System.out.println("Opção inválida");
                        }
                    }
                break;
                case 3:
                    if(pMago.getVida() == 0) {
                        mostrarPersonagemMorto(pMago.getNome());
                    } else {
                        System.out.println("\n\n << -- Mago -- >>");
                        System.out.println(" [1] Arqueiro");
                        System.out.println(" [2] Guerreiro");
                        op = pegarPlayerVitima();
                        if(op == 1) {
                            pArqueiro.sofrerDano(pMago.getDano());
                        }
                        else if(op == 2) {
                            pGuerreiro.sofrerDano(pMago.getDano());
                        }
                        else {
                            System.out.println("Opção inválida");
                        }
                    }
                break;
                case 0: System.out.println("Saindo..."); break;
            }
        }while(opcao != 0);
        ler.close();
    }
}
