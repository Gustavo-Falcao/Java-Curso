package TratamentoDeErros;

import java.util.Scanner;

public class InputHelper {

    static Scanner ler = new Scanner(System.in);

    public static int pegarInt(String frase) {
        int num = -1;
        boolean erro = false;
        while(!erro) {
            try {
                System.out.print(frase);
                num = Integer.parseInt(ler.nextLine());
                erro = true;
            } catch (Exception e) {
                System.out.println("Digite apenas numeros!!");
            }
        }

        return num;
    }
}
