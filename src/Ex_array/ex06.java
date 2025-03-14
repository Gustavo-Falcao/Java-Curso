package Ex_array;

import java.util.Arrays;

public class ex06 {

    public static void main(String[] args) {
        int[] numeros1 = {1, 2, 3, 4, 5};

        int[] num2 = Arrays.copyOf(numeros1, numeros1.length);

        System.out.println("\nPrimeiro array");
        for(int num : numeros1) {
            System.out.println(num);
        }

        System.out.println("\nSegundo array");
        for(int num : num2) {
            System.out.println(num);
        }
    }
}
