package Lista2;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);

        ler.close();
    }
}
