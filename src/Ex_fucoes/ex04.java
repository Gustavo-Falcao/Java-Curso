package Ex_fucoes;

import java.util.Scanner;

public class ex04 {

    public static int fatorial(int n) {
        int fat = 1;
        for(int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um valor inteiro: ");
        System.out.println("O fatorial é: " + fatorial(ler.nextInt()));

        ler.close();
    }
}
