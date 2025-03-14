package Ex_array;
import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numerosA = new int[5];
        int[] numerosB = new int[5];
        int[] numerosC = new int[5];
        int x = 0;

       for(int i = 0; i < numerosA.length; i++) {
           System.out.print("Informe um numero para o A: ");
           numerosA[i] = ler.nextInt();
           System.out.print("Informe um numero para o B: ");
           numerosB[i] = ler.nextInt();
       }

       for(int i = 0; i < numerosA.length; i++) {
           if(i % 2 == 0){
               numerosC[x++] = numerosB[i];
           } else {
               numerosC[x++] = numerosA[i];
           }
       }

       for(int num : numerosC) {
           System.out.println(num);
       }

        ler.close();
    }
}
