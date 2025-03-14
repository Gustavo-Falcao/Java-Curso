package Lista1;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner ler = new Scanner(System.in);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
        }
        double media = 0;
        for(int numero : numeros) {
            media += numero;
        }

        media /= numeros.length;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] < media) {
                System.out.println("Numero: " + numeros[i] + " é menor que a média.");
            }
            else if(numeros[i] == media) {
                System.out.println("Numero: " + numeros[i] + " é igual a média.");
            }
            else {
                System.out.println("Numero: " + numeros[i] + " é maior que a média.");
            }
        }

        ler.close();
    }
}
