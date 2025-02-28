package Ex_Logica;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num = ler.nextInt();

        System.out.print("O dobro do número é: " + num * 2);

        ler.close();
    }

}
