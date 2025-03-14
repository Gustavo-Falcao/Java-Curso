package Ex_Logica;
import java.util.Scanner;

// GRAUS FARENHEIT farenheit = (gC * 1.8) + 32
// GRAUS KELVIN kelvin = gc + 273,15

public class ex06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe uma temperatura em graus celcius: ");
        float temp_cel = Float.parseFloat(ler.nextLine());

        System.out.println("<<-- Escolha a conversão desejada -->>");
        System.out.println(" ## [1] Fahrenheit");
        System.out.println(" ## [2] Kelvin");
        System.out.print("Informe um opção: ");
        int opcao = ler.nextInt();

        if(opcao == 1) {
            float far = (temp_cel * 1.8f) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + far + "ºF");
        } else {
            float kel = temp_cel + 273;
            System.out.print("A temperatura em Kelvin é: " + kel + " K");
        }

        ler.close();
    }
}
