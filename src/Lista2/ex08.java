package Lista2;

import java.util.Scanner;

public class ex08 {

    public static int contarVogais(String palavra) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int quantVogais = 0;

        for(char letra : vogais) {
            for(int i = 0; i < palavra.length(); i++) {
                if(letra == palavra.charAt(i)) {
                    quantVogais++;
                }
            }
        }
        return quantVogais;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um palavra: ");
        System.out.println("\nA palavra contém: " + contarVogais(ler.nextLine()) + " vogais.");
        ler.close();
    }
}
