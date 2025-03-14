package Lista1;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[5];
        int[] pesos = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Informe a nota " + (i+1) + ": ");
            notas[i] = Double.parseDouble(ler.nextLine());
            System.out.print("Informe o peso " + (i+1) + ": ");
            pesos[i] = Integer.parseInt(ler.nextLine());
        }
        double media = 0;
        int somaPesos = 0;
        for(int i = 0; i < 5; i++) {
            media += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        media /= somaPesos;

        System.out.println("A sua média ponderada é: " + media);
    }
}
