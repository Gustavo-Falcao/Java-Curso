package Lista2;

import java.util.Scanner;

public class ex06 {

    public static void exibirTabuada(int num) {
        System.out.println("\n-->> Tabuada de " + num + ": ");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (num*i));
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número para a tabuada: ");
        exibirTabuada(ler.nextInt());

        ler.close();
    }
}
