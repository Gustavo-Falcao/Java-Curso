package Ex_fucoes;

public class ex05 {

    public static int ContagemVogais(String sentence) {
        char[] arrayChar = new char[] {'a', 'e', 'i', 'o', 'u', 'é', 'í'};
        int cont = 0;

        for(char caracter : arrayChar) {
            for(int i = 0; i < sentence.length(); i++) {
                if(sentence.charAt(i) == caracter) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        String frase = "Java é incrível";

        System.out.print("Quantidade de vogais na frase: " + ContagemVogais(frase));

    }
}

//public static int ContagemVogais(String sentence) {
//    int cont = 0;
//
//    for(int i = 0; i < sentence.length(); i++) {
//        if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
//            cont++;
//        }
//    }
//
//    return cont;
//}
//
//public static void main(String[] args) {
//    String frase = "Java é incrível";
//
//    System.out.print("Quantidade de vogais na frase: " + ContagemVogais(frase));
//
//}
