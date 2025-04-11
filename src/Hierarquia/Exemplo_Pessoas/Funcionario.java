package Hierarquia.Exemplo_Pessoas;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    Funcionario(String cargo, double salario, String nome, String cpf) {
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }
    public void trabalhar() {
        System.out.println(this.nome + " trabalhando!!");
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
}
