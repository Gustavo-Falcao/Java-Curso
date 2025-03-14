package Ex_array;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = ler.nextInt();
        }

        System.out.println("\nNumeros primos do array");
        for(int num : numeros) {
            int quant = 0;

            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    quant++;
                }
            }

            if(quant == 2) {
                System.out.println(num);
            }
        }

        ler.close();
    }
}
