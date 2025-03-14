package Ex_Logica;
import java.util.Scanner;

// receber um numero e informar ao usuario se ele é primo ou nao


public class ex09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num = ler.nextInt();
        int cont = 0;

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) cont++;
        }

        if(cont == 2) {
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("O número " + num + " não é primo.");
        }

        ler.close();
    }
}
