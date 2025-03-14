package Ex_array;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float media = 0.0f;
        float[] numeros = new float[8];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = ler.nextFloat();
        }

        for(float num : numeros) {
            media += num;
        }

        media /= numeros.length;

        System.out.printf("\nA media dos valores: %.2f", media);

        ler.close();
    }
}
