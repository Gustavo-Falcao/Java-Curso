package Hierarquia.Exemplo_Pessoas;

public class Pessoa {

    protected String nome;
    protected String cpf;

    Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostrarPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
