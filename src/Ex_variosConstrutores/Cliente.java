package Ex_variosConstrutores;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private int idCliente;
    private String telefone;
    private String email;

    public Cliente(String nome, int idade, String cpf, int idCliente, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.idCliente = idCliente;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente(String nome, int idade, String cpf, int idCliente) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.idCliente = idCliente;
    }

    public Cliente(String nome, String cpf, int idCliente) {
        this.nome = nome;
        this.cpf = cpf;
        this.idCliente = idCliente;
    }

    public void mostrarInfoCliente() {
        System.out.println("#>> Nome: " + getNome());
        System.out.println("#>> Idade: " + getIdade());
        System.out.println("#>> CPF: " + getCpf());
        System.out.println("#>> idCliente: " + getIdCliente());
        System.out.println("#>> Email: " + getEmail());
        System.out.println("#>> Telefone: " + getTelefone());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
