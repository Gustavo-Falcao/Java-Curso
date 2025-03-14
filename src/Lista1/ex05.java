package Lista1;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
        }

        System.out.print("Informe um numero qualque: ");
        int num = ler.nextInt();
        int quant = 0;

        for(int numero : numeros) {
            if(num == numero) {
                quant++;
            }
        }

        System.out.println("O numero: " + num + " aparece " + quant + " vezes.");
    }
}
