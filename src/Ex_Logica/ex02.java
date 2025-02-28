package Ex_Logica;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("<<-- NASCIMENTO -->>");
        System.out.print("Informe o dia: ");
        int day = Integer.parseInt(ler.nextLine());

        System.out.print("Informe o mês: ");
        int month = Integer.parseInt(ler.nextLine());

        System.out.print("Informe o ano: ");
        int year = Integer.parseInt(ler.nextLine());

        System.out.println("Dia: " + day);
        System.out.println("Mês: " + month);
        System.out.println("Ano: " + year);
        System.out.print("Você nasceu no dia " + day +" de " + month + " de " + year + ". Correto?");

        ler.close();
    }

}
