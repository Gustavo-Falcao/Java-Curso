package Ex_Logica;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a sua matrícula: ");
        String matricula = ler.nextLine();

        System.out.print("Informe o seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Informe a sua primeira nota: ");
        float nota1 = Float.parseFloat(ler.nextLine());

        System.out.print("Informe a sua segunda nota: ");
        float nota2 = Float.parseFloat(ler.nextLine());

        float notFinal = (nota1 + nota2) / 2;

        System.out.println("\nMatrícula: " + matricula);
        System.out.println("Nome: " + nome);

        if(notFinal >= 6) {
            System.out.println("Aprovado: (x)Sim ()Não");
        } else {
            System.out.println("Aprovado: ()Sim (x)Não");
        }

        System.out.println("Nota Final: " + notFinal);
    }
}
