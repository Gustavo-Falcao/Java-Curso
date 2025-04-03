package FujaDoPolicial;

import java.util.Scanner;

public class Main {

    public static void mostraErro() {
        System.out.println("-->> Movimento inválido!!!");
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] tabuleiro = new String[5][5];

        Policia policia = new Policia(0, 0, " [👮‍♂️] ");
        Fugitivo fugitivo = new Fugitivo(2, 2, " [👾] ");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                tabuleiro[i][j] = " [  ] ";
            }
        }

        tabuleiro[policia.x][policia.y] = policia.emoji;
        tabuleiro[fugitivo.x][fugitivo.y] = fugitivo.emoji;

        while(true) {
            System.out.println("\n      FUJA DO POLICIAL !!!!");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
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
                if(fugitivo.x - 1 >= 0) {
                    String aux = tabuleiro[fugitivo.x-1][fugitivo.y];
                    tabuleiro[fugitivo.x-1][fugitivo.y] = fugitivo.emoji;
                    tabuleiro[fugitivo.x][fugitivo.y] = aux;
                    fugitivo.x -= 1;
                }
                else {
                    mostraErro();
                }
            }
            else if(movimento == 'S' || movimento == 's') {
                if(fugitivo.x + 1 < 5) {
                    String aux = tabuleiro[fugitivo.x+1][fugitivo.y];
                    tabuleiro[fugitivo.x+1][fugitivo.y] = fugitivo.emoji;
                    tabuleiro[fugitivo.x][fugitivo.y] = aux;
                    fugitivo.x += 1;
                } else {
                    mostraErro();
                }
            }
            else if(movimento == 'D' || movimento == 'd') {
                if(fugitivo.y + 1 < 5) {
                    String aux = tabuleiro[fugitivo.x][fugitivo.y+1];
                    tabuleiro[fugitivo.x][fugitivo.y+1] = fugitivo.emoji;
                    tabuleiro[fugitivo.x][fugitivo.y] = aux;
                    fugitivo.y += 1;
                }else {
                    mostraErro();
                }
            }
            else if(movimento == 'A' || movimento == 'a') {
                if(fugitivo.y - 1 >= 0) {
                    String aux = tabuleiro[fugitivo.x][fugitivo.y-1];
                    tabuleiro[fugitivo.x][fugitivo.y-1] = fugitivo.emoji;
                    tabuleiro[fugitivo.x][fugitivo.y] = aux;
                    fugitivo.y -= 1;
                } else {
                    mostraErro();
                }
            }
            else if(movimento == 'Z' || movimento == 'z') {
                System.out.println("Encerrando...");
                break;
            }

            int xp = (policia.x - fugitivo.x) * (-1);
            int py = (policia.y - fugitivo.y) * (-1);
            int xAntigo = policia.x;
            int yAntigo = policia.y;
            String aux = " [  ] ";

            if(xp < py) {
                // aumentar o x para ir mais perto
                if(policia.x < fugitivo.x){
                    //verificando se pulando 2 casas ainda está dentro do tabuleiro
                    if(policia.x + 2 < 5) {
                        policia.x += 2;
                    }
                    //verificando se pulando 1 casa ainda está dentro do tabuleiro
                    else if(policia.x + 1 < 5) {
                        policia.x += 1;
                        //verificando se o fugitivo está na direita
                        if(policia.y < fugitivo.y) {
                            policia.y += 1;
                        }
                        //verificando se o fugitivo está na esquerda
                        else if(policia.y > fugitivo.y) {
                            policia.y -= 1;
                        }
                    }
                    //verificando se os dois estão na mesma linha
                    else if(policia.x == fugitivo.x) {
                        //verificando se o fugitivo está na direita
                        if(policia.y < fugitivo.y) {
                            //verificando movimento válido
                            if(policia.y + 2 < 5){
                                policia.y += 2;
                            }
                            else {
                                policia.y +=1;
                            }
                        }
                        //verificando se o fugitivo está na esquerda
                        else if(policia.y > fugitivo.y) {
                            //verificando movimento válido
                            if(policia.y - 2 >= 0) {
                                policia.y -= 2;
                            }
                            else {
                                policia.y -= 1;
                            }
                        }
                    }

                }
//                else if(policia.x > fugitivo.x) {
//                    policia.
//                }

            }
//            else if(py < xp) {
//                policia.y += 2
//            }

            tabuleiro[xAntigo][yAntigo] = aux;
            tabuleiro[policia.x][policia.y] = policia.emoji;

        }

    }
}
