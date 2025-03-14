package Orientacao_objetos.Exemplo2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente[] clientes = new Cliente[3];

        for(int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente();
            System.out.println("\nCliente " + (i+1));
            System.out.print("Nome: ");
            clientes[i].name = ler.nextLine();
            System.out.print("Idade: ");
            clientes[i].age = Integer.parseInt(ler.nextLine());
            System.out.print("Email: ");
            clientes[i].email = ler.nextLine();
        }

        clientes[0].MostraDados(1);


        ler.close();
    }
}
