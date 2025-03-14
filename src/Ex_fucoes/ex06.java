package Ex_fucoes;

public class ex06 {

    public static int maiorValor(int[] array) {
        int maiorVal = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > maiorVal) {
                maiorVal = array[i];
            }
        }
        return maiorVal;
    }

    public static int menorValor(int[] array) {
        int menorVal = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < menorVal) {
                menorVal = array[i];
            }
        }
        return menorVal;
    }

    public static void main(String[] args) {
        int[] numeros = new int[] {3, 7, 2, 10, 6};

        System.out.println("Maior valor do array: " + maiorValor(numeros));
        System.out.println("Menor valor do array: " + menorValor(numeros));

    }
}
