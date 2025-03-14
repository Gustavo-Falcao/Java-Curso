package Ex_Logica;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pessoas;

        System.out.print("Informe o numero de pessoas: ");
        pessoas = Integer.parseInt(ler.nextLine());

        while(pessoas < 1 || pessoas > 5) {
            System.out.println("O numero de pessoas deve estar entre 1 e 5!!");
            System.out.print("Informe a quantidade novamente: ");
            pessoas = Integer.parseInt(ler.nextLine());
        }

        System.out.println("Iniciando reservas...");

        ler.close();

    }
}
