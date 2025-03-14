package Lista1;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um número para o array: ");
        int size = Integer.parseInt(ler.nextLine());

        int[] numeros = new int[size];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
        }

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("\nIndice -> " + i);
            if(numeros[i] > 0) {
                System.out.println("Numero positivo");
            } else if (numeros[i] < 0) {
                System.out.println("Numero negativo");
            } else {
                System.out.println("Numero igual a 0");
            }
        }

        ler.close();
    }
}
