package Ex_fucoes;

import java.util.Scanner;

public class ex01 {

    public static int catchInputInt(){
        Scanner ler = new Scanner(System.in);
        return ler.nextInt();
    }

    public static void main(String[] args) {
        System.out.print("Informe um numero: ");
        int numero = catchInputInt();

        System.out.println("O dobro do seu numero é: " + (numero*2));
    }
}
