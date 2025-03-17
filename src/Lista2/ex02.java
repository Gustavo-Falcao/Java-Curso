package Lista2;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[10];
        int quantPares = 0;

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
            if(numeros[i] % 2 == 0) {
                quantPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantPares);

        ler.close();
    }
}
