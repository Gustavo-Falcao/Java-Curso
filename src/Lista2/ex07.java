package Lista2;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o valor a ser sacado: ");
        int valor = ler.nextInt();

        int resto;

        System.out.println("Notas de 100: " + (valor/100));
        resto = valor % 100;
        System.out.println("Notas de 50: " + resto/50);
        resto %= 50;
        System.out.println("Notas de 20: " + resto/20);
        resto %= 20;
        System.out.println("Notas de 10: " + resto/10);
        resto %= 10;
        System.out.println("Notas de 5: " + resto/5);
        resto %= 5;
        System.out.println("Notas de 2: " + resto/2);

        ler.close();
    }
}
