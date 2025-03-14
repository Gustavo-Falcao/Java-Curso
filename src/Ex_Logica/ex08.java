package Ex_Logica;
import java.util.Scanner;


/*
imc < 18.5 -> Abaixo do peso
imc entre 18.5 - 24.9 -> peso ideal
imc entre 25.0 - 29.9 -> Sobrepeso
imc >= 30.0 -> Obesidade

receber peso e altura
calcular o imc => imc = peso/altura ** 2;

Mostrar:
- Seu imc é: imc
- Classificação: peso ideal
*/


public class ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String classificacao = "";

        System.out.print("Informe o seu peso: ");
        float peso = Float.parseFloat(ler.nextLine());

        System.out.print("Informe a sua altura: ");
        float altura = Float.parseFloat(ler.nextLine());

        float imc = peso / (float) (Math.pow(altura,2));

        if(imc < 18.5) {
            classificacao = "Abaixo do peso";
        }
        else if(imc <= 24.9) {
            classificacao = "Peso ideal";
        }
        else if (imc <= 29.9) {
            classificacao = "Sobrepeso";
        }
        else {
            classificacao = "Obesidade";
        }

        System.out.printf("Seu imc é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        ler.close();
    }
}
