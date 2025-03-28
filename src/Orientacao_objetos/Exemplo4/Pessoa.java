package Orientacao_objetos.Exemplo4;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }

    class Casa {
        private Endereco endereco;

        Casa(Endereco endereco) {
               this.endereco = endereco;
        }


    }

}
