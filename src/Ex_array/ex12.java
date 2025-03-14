package Ex_array;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] clientes = new String[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno: " + (i + 1));
            System.out.print("Informe a Matricula: ");
            clientes[i][0] = ler.nextLine();
            System.out.print("Informe o nome: ");
            clientes[i][1] = ler.nextLine();
            System.out.print("Informe a nota 1: ");
            clientes[i][2] = ler.nextLine();
            System.out.print("Informe a nota 2: ");
            clientes[i][3] = ler.nextLine();
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
                System.out.println("\nMatricula: " + clientes[i][0]);
                System.out.println("Nome: " + clientes[i][1]);
                float nota1 = Float.parseFloat(clientes[i][2]);
                float nota2 = Float.parseFloat(clientes[i][3]);
                float media = (nota1 + nota2) / 2;
                if(media >= 6) {
                    System.out.println("Aprovado: (x)Sim ()Não ");
                } else {
                    System.out.println("Aprovado: ()Sim (x)Não ");
                }
                System.out.println("Nota final: " + media);

            ler.close();
        }
    }
}

