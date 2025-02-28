package Ex_Logica;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
           Scanner ler = new Scanner(System.in);

           System.out.print("Informe um número: ");
           int num1 = Integer.parseInt(ler.nextLine());

           System.out.print("Informe outro número: ");
           int num2 = Integer.parseInt(ler.nextLine());

           System.out.println("Primeiro Número: " + num1);
           System.out.println("Segundo Número: " + num2);
           System.out.print("A soma é: " + (num1 + num2));

           ler.close();
    }

}
