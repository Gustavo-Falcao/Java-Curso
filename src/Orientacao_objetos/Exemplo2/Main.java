package Orientacao_objetos.Exemplo2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.print("Informe quantos clientes quer cadastrar: ");
        int quantClientes = Integer.parseInt(ler.nextLine());

        for(int i = 0; i < quantClientes; i++) {
            Cliente usuario = new Cliente();

            System.out.println("\nCliente " + (i+1));
            System.out.print("Nome: ");
            usuario.name = ler.nextLine();
            System.out.print("Idade: ");
            usuario.age = Integer.parseInt(ler.nextLine());
            System.out.print("Email: ");
            usuario.email = ler.nextLine();

            clientes.add(usuario);

        }

        int x = 1;

        System.out.println("\n\n<<<-- CLIENTES CADASTRADOS -->>>\n");
        for(Cliente pessoas : clientes) {
            System.out.println("\nCliente " + (x++));
            pessoas.MostraDados();
        }

        ler.close();
    }
}
