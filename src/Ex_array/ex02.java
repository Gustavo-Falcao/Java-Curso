package Ex_array;
import java.util.Scanner;


public class ex02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[15];

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Informe um numero: ");
            numeros[i] = ler.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i < numeros.length; i++) {
            if(maior < numeros[i]) {
                maior = numeros[i];
            }
            if(menor > numeros[i]) {
                menor = numeros[i];
            }
        }

        System.out.println("Numeros do array");
        for(int num: numeros) {
            System.out.println(num);
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        ler.close();
    }
}
