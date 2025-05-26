package Teste_com_regex;

import java.util.Scanner;

public class Main {

    public static boolean isEmailValido(String email) {
       if(!email.matches("^[a-z._0-9+-]+@[a-z]{3,}+\\.[a-z]{2,}$")) {
           throw new IllegalArgumentException("Formato de email inválido!!");
       } else {
           return true;
       }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean valido = false;
        Cliente c1 = new Cliente();
        while(!valido) {
            try {
                System.out.println("Digite o nome: ");
                String nome = ler.nextLine();
                System.out.println("Digite o email: ");
                String email = ler.nextLine();
                valido = isEmailValido(email);
                c1.setNome(nome);
                c1.setEmail(email);
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        c1.mostrarInfo();
    }
}
