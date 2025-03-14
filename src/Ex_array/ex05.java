package Ex_array;
import java.util.Scanner;


public class ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um numero: ");
            numeros[i] = scanner.nextInt();
        }

        for(int i = (numeros.length - 1); i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
