package Lista1;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o tamanho do array: ");
        int size = Integer.parseInt(ler.nextLine());

        int[] numeros = new int[size];
        int[] dobro = new int[size];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
            dobro[i] = numeros[i] * 2;
        }

        System.out.println();
        for(int numero : dobro) {
            System.out.println(numero);
        }


    }
}
