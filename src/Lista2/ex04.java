package Lista2;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double media;
        double notas = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("  -->> " + (i+1) + "º nota <<--");
            System.out.print("Informe a nota: ");
            notas += Double.parseDouble(ler.nextLine());
        }

        media = notas / 5;

        System.out.println("\nMédia: " + media);
        String situacao = media >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Situação: " + situacao);

        ler.close();
    }
}
