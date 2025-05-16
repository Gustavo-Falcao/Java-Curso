package TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] ags) {
        Scanner ler = new Scanner(System.in);
        int idade;

        System.out.print("Nome: ");
        String nome = ler.nextLine();
        idade = InputHelper.pegarInt("Idade: ");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);


    }
}
