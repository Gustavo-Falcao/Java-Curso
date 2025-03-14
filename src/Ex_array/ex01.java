package Ex_array;

public class ex01 {

    public static void main(String[] args) {
         int[] numeros = {1, 4, 10, 45, 4, 3};
         int soma = 0;

         for(int num : numeros) {
             soma += num;
         }

         System.out.println("Soma dos valores: " + soma);
    }
}
