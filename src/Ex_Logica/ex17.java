package Ex_Logica;

import java.util.Scanner;


public class ex17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float pagamento = 0.0f;

        do {
            System.out.print("Insira o dinheiro: ");
            float din = ler.nextFloat();
            pagamento += din;

        } while(pagamento < 50);


        System.out.println("Pagamento realizado com sucesso!!!");

        if(pagamento > 50) {
            float troco = pagamento - 50;
            System.out.print("Seu troco: " + troco);
        } else {
            System.out.println("Sem troco");
        }

        ler.close();
    }
}
