package Arrays_Dinamicos.ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(-4);
        numeros.add(10);
        numeros.add(43);
        numeros.add(-56);
        numeros.add(12);
        numeros.add(7);
        numeros.add(22);
        numeros.add(16);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("Primeiro valor: " + numeros.getFirst());
        System.out.println("Ultimo valor: " + numeros.getLast());

        for(int numero : numeros) {
            System.out.println("numero = " + numero);
        }
    }


}
