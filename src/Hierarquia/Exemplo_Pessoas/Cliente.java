package Hierarquia.Exemplo_Pessoas;

public class Cliente extends Pessoa{

    String email;
    Cliente(String nome, String cpf, String email) {
        super(nome, cpf);
        this.email = email;
    }

    public void mostrarCLiente() {
        this.mostrarPessoa();
        System.out.println("Email: " + email);
    }

    public void fazerCompra() {
        System.out.println(this.nome + " comprando!!");
    }
}
