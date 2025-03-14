package Ex_fucoes;

import java.util.Scanner;


public class ex03 {

    public static double celsiusParaFahrenheit(double temperatura) {
        return ((temperatura * 1.8) + 32);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe um valor em celsius: ");
        System.out.println("A sua temperatura em Fahrenheit é: " + celsiusParaFahrenheit(ler.nextDouble()));

        ler.close();
    }
}
