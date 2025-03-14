package Ex_Logica;

import java.util.Scanner;


public class ex10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float bonus = 0.0f;

        System.out.print("Informe o seu salário: ");
        float salario = Float.parseFloat(ler.nextLine());

        System.out.print("Informe o tempo de serviço (anos): ");
        int tempo = Integer.parseInt(ler.nextLine());

        if(tempo < 1) {
            System.out.println("Sem bônus.");
        }
        else if(tempo <= 3) {
            bonus = salario * 0.05f;
        }
        else if(tempo <= 6) {
            bonus = salario * 0.1f;
        }
        else {
            bonus = salario * 0.15f;
        }

        System.out.printf("Seu bônus é: R$ %.1f", bonus);
        System.out.printf("\nSalário com bônus: R$ %.1f", salario + bonus);

        ler.close();
    }
}
