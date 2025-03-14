package Orientacao_objetos.Exemplo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Alunos aluno1 = new Alunos();
        //Alunos aluno2 = new Alunos();
        Scanner ler = new Scanner(System.in);
        Alunos[] turma = new Alunos[2];

        for(int i = 0; i < turma.length; i++) {
            turma[i] = new Alunos();
            System.out.println("\n<<-- Info Aluno " + (i+1) + " -->>");

            System.out.print("-->> Nome: ");
            turma[i].nome = ler.nextLine();

            System.out.print("-->> Nota 1: ");
            turma[i].nota1 = Double.parseDouble(ler.nextLine());

            System.out.print("-->> Nota 2: ");
            turma[i].nota2 = Double.parseDouble(ler.nextLine());
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
