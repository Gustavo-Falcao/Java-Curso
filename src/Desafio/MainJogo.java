package Desafio;

import java.util.Scanner;

public class MainJogo {

    public static void mostraErro() {
        System.out.println("-->> Movimento inválido!!!");
    }

    public static void main(String[] args) {
        String[][] tabuleiro = new String[5][5];
        Scanner ler = new Scanner(System.in);

        Policia policia = new Policia(0, 0, " [👮‍] ");
        //Ladrao ladrao = new Ladrao(4, 0, "[ 💀 ]");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                tabuleiro[i][j] = " [  ] ";
            }
        }

        tabuleiro[policia.x][policia.y] = policia.emoji;

        while(true) {
            System.out.println();
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++) {
                    System.out.print(tabuleiro[i][j]);
                }
                System.out.println();
            }

            System.out.println("\n -----------------------");
            System.out.println(" | W -> Para cima      |");
            System.out.println(" | S -> Para baixo     |");
            System.out.println(" | A -> Para esquerda  |");
            System.out.println(" | D -> Para direita   |");
            System.out.println(" | Z -> Encerrar jogo  |");
            System.out.println(" -----------------------");
            System.out.print(" | Digite seu movimento: ");
            char movimento = ler.next().charAt(0);

            if(movimento == 'W' || movimento == 'w') {
                if(policia.x - 1 >= 0) {
                    String aux = tabuleiro[policia.x-1][policia.y];
                    tabuleiro[policia.x-1][policia.y] = policia.emoji;
                    tabuleiro[policia.x][policia.y] = aux;
                    policia.x -= 1;
                }
                else {
                    mostraErro();
                }
            }
            else if(movimento == 'S' || movimento == 's') {
                if(policia.x + 1 < 5) {
                    String aux = tabuleiro[policia.x+1][policia.y];
                    tabuleiro[policia.x+1][policia.y] = policia.emoji;
                    tabuleiro[policia.x][policia.y] = aux;
                    policia.x += 1;
                } else {
                    mostraErro();
                }
            }
            else if(movimento == 'D' || movimento == 'd') {
                if(policia.y + 1 < 5) {
                    String aux = tabuleiro[policia.x][policia.y+1];
                    tabuleiro[policia.x][policia.y+1] = policia.emoji;
                    tabuleiro[policia.x][policia.y] = aux;
                    policia.y += 1;
                }else {
                    mostraErro();
                }
            }
            else if(movimento == 'A' || movimento == 'a') {
                if(policia.y - 1 >= 0) {
                    String aux = tabuleiro[policia.x][policia.y-1];
                    tabuleiro[policia.x][policia.y-1] = policia.emoji;
                    tabuleiro[policia.x][policia.y] = aux;
                    policia.y -= 1;
                } else {
                    mostraErro();
                }
            }
            else if(movimento == 'Z' || movimento == 'z') {
                System.out.println("Encerrando...");
                break;
            }
        }

    }

}
