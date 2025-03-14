package Ex_array;

import java.util.Scanner;


public class ex11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = {5, 8, 12, 17, 21, 30, 42};
        int pares = 0;
        int impares = 0;

        for(int i = 0; i < numeros.length; i++) {
            if(i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quant pares: " + pares);
        System.out.println("Quant impares: " + impares);
    }
}
