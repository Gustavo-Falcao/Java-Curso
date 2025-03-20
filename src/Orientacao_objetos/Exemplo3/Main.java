package Orientacao_objetos.Exemplo3;

import java.util.Scanner;


public class Main {
    private static final Scanner ler = new Scanner(System.in);

    public static String pegarIputString(String frase) {
       System.out.print(frase);
       return ler.nextLine();
    }

    public static double pegarInputDouble(String frrase) {
        System.out.print(frrase);
        return Double.parseDouble(ler.nextLine());
    }

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];

        for(int i = 0; i < funcionarios.length; i++) {
            String nome = pegarIputString("Informe o seu nome: ");
            String cargo = pegarIputString("Informe o seu cargo: ");
            double sal = pegarInputDouble("Informe o salario: ");

            funcionarios[i] = new Funcionario(nome, cargo, sal);
        }

        for(Funcionario func : funcionarios) {
            func.mostrarInfo();
        }

        funcionarios[0].setSalary(45000);

        funcionarios[0].mostrarInfo();

        ler.close();
    }
}
