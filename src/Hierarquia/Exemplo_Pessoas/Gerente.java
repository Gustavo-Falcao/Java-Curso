package Hierarquia.Exemplo_Pessoas;

public class Gerente extends Funcionario{

    protected int equipe;

    Gerente(String cargo, double salario, String nome, String cpf, int equipe) {
        super(cargo, salario, nome, cpf);
        this.equipe = equipe;
    }

    public void mostrarGerente() {
        mostrarFuncionario();
        System.out.println("Equipe: " + this.equipe);
    }

    public void gerenciar() {
        System.out.println(this.nome + " gerenciando");
    }
}
