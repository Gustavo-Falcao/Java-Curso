package Hierarquia.Exemplo_Pessoas;

public class Vendedor extends Funcionario {

    protected int meta;

    Vendedor(String cargo, double salario, String nome, String cpf, int meta) {
        super(cargo, salario, nome, cpf);
        this.meta = meta;
    }

    public void vender() {
        System.out.println(this.nome + " vendendo...");
    }

}
