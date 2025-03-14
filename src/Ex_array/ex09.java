package Ex_array;

import java.util.Arrays;


public class ex09 {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 4, 3, 2, 1, 5, 7, 2, 9, 10, 34, 7, 9, 2, 2};
        int tamanho = numeros.length;

        System.out.println("\nArray normal: "+ Arrays.toString(numeros));

        for(int i = 0; i < tamanho-1; i++) {
            for(int x = i + 1; x < tamanho-1; x++) {
                if(numeros[i] == numeros[x]) {
                    for(int j = x; j < tamanho-1; j++) {
                        int aux = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = aux;
                    }
                    x--;
                    tamanho--;
                }
            }
        }

        int[] novoNumeros = Arrays.copyOf(numeros, tamanho);

        System.out.println("\nArray sem duplicatas: " + Arrays.toString(novoNumeros));
    }

}
