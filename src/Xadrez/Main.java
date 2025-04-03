package Xadrez;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        String[][] tabuleiro = new String[5][5];
        ArrayList<Player> pecas = new ArrayList<Player>();

        Player p1 = new Player(2, 2, " [ 😎 ] ");
        Inimigo i1 = new Inimigo(3,3, " [ 👾 ] ");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                tabuleiro[i][j] = " [ . ] ";
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(tabuleiro[p1.x][p1.y].equals(" [ . ] ") && !tabuleiro[p1.x][p1.y].equals(i1.representacao)) {
                    tabuleiro[p1.x][p1.y] = p1.representacao;
                }
                if(tabuleiro[i1.x][i1.y].equals(" [ . ] ") && !tabuleiro[i1.x][i1.y].equals(p1.representacao)) {
                    tabuleiro[i1.x][i1.y] = i1.representacao;
                }
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }


    }
}
