package Ex_array;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = ler.nextInt();
        }

        for(int num : numeros) {
            if(num % 2 == 0) {
                pares++;
            }
        }

        System.out.println("\nQuantidade de numeros pares: " + pares);

        ler.close();
    }
}
