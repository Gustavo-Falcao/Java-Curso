package Tipos_de_listas.HashMap;


import java.util.HashMap;
import java.util.Scanner;

// Criar classe cliente com atributos nome, idade e email e defindo ela como private;
// Criar construtor para cliente
// Criar método exibirInfo para mostrar as informações do cliente;

// Na main criar um hashmap com chave do tipo String e valor do tipo objeto cliente;
// Criar clientes e passar valores manualmente
// adicionar clientes no hashmap clientes
// printar chave valor e clientes com for-each utilizando o método para mostrar informações do cliente
// receber uma chave do usuário e mostrar na tela se ela existe ou não.

public class Main {

    private static final Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String,Cliente> clientes = new HashMap<String,Cliente>();
        Cliente cliente01 = new Cliente("Gustavo", 20, "duartegusfalcao@gmail.com");
        Cliente cliente02 = new Cliente("Pedro", 15, "pedro@gmail.com");
        Cliente cliente03 = new Cliente("Rafael", 30, "rafael@gmail.com");

        System.out.print("Digite o nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(ler.nextLine());
        System.out.print("Digite o email: ");
        String email = ler.nextLine();

        clientes.put("K1", cliente01);
        clientes.put("k2", cliente02);
        clientes.put("k3", cliente03);

        for(String chave: clientes.keySet()) {
            clientes.get(chave).exibirInfo();
            System.out.println();
        }

        String chaveBusca = "k2";

        if(clientes.containsKey(chaveBusca)) {
            System.out.println("Chave encontrada");
            System.out.println(chaveBusca);
            clientes.get(chaveBusca).exibirInfo();
        }
    }
}
