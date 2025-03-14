package Lista1;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
        }

        System.out.println();

        System.out.print("Informe um numero qualquer: ");
        int num = ler.nextInt();

        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] < num) {
                System.out.println("Indice -> " + i);
            }
        }

        ler.close();
    }
}
