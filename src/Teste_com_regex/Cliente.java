package Teste_com_regex;

public class Cliente {
    private String nome;
    private String email;

    public Cliente() {

    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
