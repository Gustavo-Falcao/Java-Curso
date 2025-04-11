package Hierarquia.Exemplo_Pessoas;

public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Eduardo", "112345678987");

        Funcionario func = new Funcionario("Analista", 4500, "Pedro", "98654312345");

        Cliente cli = new Cliente("Janna", "54367845342", "janna@gmail.com");

        Gerente ger = new Gerente("Gerente", 15800, "Rafael", "34322132356", 3);

        p.mostrarPessoa();
        System.out.println();
        cli.mostrarCLiente();
        cli.fazerCompra();
        System.out.println();
        func.mostrarFuncionario();
        func.trabalhar();
        System.out.println();
        ger.mostrarGerente();
        ger.gerenciar();
        ger.trabalhar();

    }
}
