package Arrays_Dinamicos.HashMap;

public class Cliente {
    private String nome;
    private int idade;
    private String email;

    Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public void exibirInfo() {
        System.out.println("->> Nome" + nome);
        System.out.println("->> Idade: " + idade);
        System.out.println("->> Email: " + email);
    }
}
