package Ex_Logica;

import java.util.Scanner;


public class ex14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
        }

        System.out.println("<<-- SEUS NUMEROS -->>");

        for(int numero : numeros) {
            System.out.println(numero);
        }

        ler.close();
    }
}
