package Lista2;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("Informe um número: ");
                numeros[i][j] = Integer.parseInt(ler.nextLine());
            }
        }

        System.out.println("\nMatriz inserida: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        ler.close();
    }
}
