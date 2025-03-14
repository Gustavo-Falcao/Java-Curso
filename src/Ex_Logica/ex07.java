package Ex_Logica;

import java.util.Scanner;

/*
   primeiro pedir para o usaio informar o seu saldo

 menu com:
 1 ver saldo
 2 sacar dinheiro
 3 depositar dinheiro
 4 sair

 caso a opcao 2 seja escolhida, o programa deve verificar se há saldo suficiente


*/
public class ex07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;

        System.out.print("Informe o seu saldo atual: ");
        float saldo = Float.parseFloat(ler.nextLine());

        do {
            System.out.println("\n## [1] Ver saldo");
            System.out.println("## [2] Sacar");
            System.out.println("## [3] Depositar");
            System.out.println("## [4] Sair");
            System.out.print("# - Escolha uma opção: ");
            opcao = Integer.parseInt(ler.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\n\n<<-- SALDO ATUAL -->>");
                    System.out.println("\n## Saldo: " + saldo);
                break;

                case 2:
                    System.out.println("\n\n<<-- REALIZAR SAQUE -->>");
                    System.out.print("\n## Infome o valor: ");
                    float val_sac = Float.parseFloat(ler.nextLine());

                    if(val_sac > saldo) {
                        System.out.println("[ERROR]--> Valor maior que o saldo atual");
                    } else {
                      saldo -= val_sac;
                      System.out.println("Saque realizado com sucesso!!");
                      System.out.println("Saldo atualizado: " + saldo);
                    }
                break;

                case 3:
                    System.out.println("\n\n<<-- DEPOSITAR -->>");
                    System.out.print("\nInforme o valor: ");
                    float saldo_add = Float.parseFloat(ler.nextLine());

                    saldo += saldo_add;

                    System.out.println("Deposito realizado com sucesso!!");
                break;

                case 4:
                    System.out.println("\nSaindo...");
                break;

                default: System.out.println("Escolha uma opção existente!!"); break;
            }
        }while(opcao != 4);

        ler.close();
    }
}
