package Ex_Logica;

import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a quantidade de produtos: ");
        int quant = Integer.parseInt(ler.nextLine());
        double soma = 0;

        for(int i = 0; i < quant; i++) {
            System.out.print("Informe o preço do produto " + (i+1) + ": ");
            soma += Double.parseDouble(ler.nextLine());
        }

        System.out.println("A soma dos produtos é: " + soma);

        ler.close();
    }
}
