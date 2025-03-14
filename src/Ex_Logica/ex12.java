package Ex_Logica;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um caractere: ");
        char caract = ler.nextLine().charAt(0);

        System.out.print("Informe o seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Seu nome é: " + nome + " a sua letra é: " + caract);

        ler.close();
    }
}
