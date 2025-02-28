package Ex_Logica;
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = ler.nextInt();

        System.out.print("O antecessor do número " + num + " é " + (num-1) + " e o sucessor é " + (num+1));

        ler.close();
    }
}
