package Orientacao_objetos.Exemplo1;

import java.util.Scanner;

public class Main {

    public static double NotaCerta(Scanner ler) {
        System.out.println("\nA nota do aluno deve estar entre 0 e 10!!");
        System.out.print("Informe a nota novamente: ");
        return Double.parseDouble(ler.nextLine());
    }

    public static void main(String[] args) {
        //Alunos aluno1 = new Alunos();
        //Alunos aluno2 = new Alunos();
        Scanner ler = new Scanner(System.in);
        Alunos[] turma = new Alunos[5];

        for(int i = 0; i < turma.length; i++) {
            turma[i] = new Alunos();
            System.out.println("\n<<-- Info Aluno " + (i+1) + " -->>");

            System.out.print("-->> Nome: ");
            turma[i].nome = ler.nextLine();

            System.out.print("-->> Nota 1: ");
            turma[i].nota1 = Double.parseDouble(ler.nextLine());
            while (turma[i].nota1 < 0 || turma[i].nota1 > 10) {
                turma[i].nota1 = NotaCerta(ler);
            }

            System.out.print("-->> Nota 2: ");
            turma[i].nota2 = Double.parseDouble(ler.nextLine());
            while (turma[i].nota2 < 0 || turma[i].nota2 > 10) {
                turma[i].nota2 = NotaCerta(ler);
            }
        }


        for(int i = 0; i < turma.length; i++) {
            System.out.println("\n##-> Aluno " + (i+1));
            System.out.println("Nome: " + turma[i].nome);
            System.out.println("Nota 1: " + turma[i].nota1);
            System.out.println("Nota 2: " + turma[i].nota2);
            turma[i].mostrarMedia();
        }

        ler.close();

    }
}
