package Orientacao_objetos.Exemplo2;

public class Cliente {
    String name;
    int age;
    String email;

    void MostraDados(int pos) {
        System.out.println("\nCliente " + pos);
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Email: " + email);
    }

}
