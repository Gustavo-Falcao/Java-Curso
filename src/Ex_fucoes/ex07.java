package Ex_fucoes;

import java.util.Scanner;

public class ex07 {

//    public static void lerMatricula(Scanner ler, String[][] alunos) {
//        for(int i = 0; i < alunos.length; i++) {
//            System.out.println("\nInformações do aluno " + (i+1));
//            System.out.print("Informe a matricula: ");
//            alunos[i][0] = ler.nextLine();
//            System.out.print("Informe o nome: ");
//            alunos[i][1] = ler.nextLine();
//        }
//    }

    // Fazer uma função para pedir a nota novamente caso a nota não esteja entre 0 e 10

    public static Double pedirNewNota(Scanner ler) {
        System.out.println("A nota deve estar entre 0 e 10!!");
        System.out.print("Informe a nota novamente: ");
        return Double.parseDouble(ler.nextLine());
    }

    public static void lerNotas(Scanner ler, double[] notas) {
        int i = 0;
        int x = 1;
        do {
            System.out.println("\nInformações do aluno: " + (x++));
            System.out.print("Informe a primeira nota: ");
            while(pedirNewNota(ler) < 0 || pedirNewNota(ler) > 10) {
                pedirNewNota(ler);
            }
            notas[i++] = pedirNewNota(ler);
            System.out.print("Informe a segunda nota: ");
            while(pedirNewNota(ler) < 0 || pedirNewNota(ler) > 10) {
                pedirNewNota(ler);
            }
            notas[i++] = Double.parseDouble(ler.nextLine());
        }while(i != notas.length);

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //String[][] alunos = new String[5][2];
        double[] notas = new double[10];

        //lerMatricula(ler, alunos);

//        for(int i = 0; i < alunos.length; i++) {
//            System.out.println("\nAluno " + i+1);
//            System.out.println("Matricula: " + alunos[i][0]);
//            System.out.println("Nome: " + alunos[i][1]);
//        }

        lerNotas(ler, notas);

        for(double nota : notas) {
            System.out.println(nota);
        }

        ler.close();

    }
}
