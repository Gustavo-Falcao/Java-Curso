package Ex_veiculos3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final Scanner ler = new Scanner(System.in);

    public static Veiculo pegarVeiculo(String tipo) {
        System.out.print("Digite o ano: ");
        int ano = Integer.parseInt(ler.nextLine());
        System.out.print("Digite a cor: ");
        String cor = ler.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = ler.nextLine();
        System.out.print("Digite o nome do veiculo: ");
        String nomeVeiculo = ler.nextLine();

        switch (tipo) {
            case "terrestre":
                System.out.print("Digite o numero de rodas: ");
                int numeroRodas = Integer.parseInt(ler.nextLine());
                return new VeiculoTerrestre(ano, cor, false, modelo, nomeVeiculo, numeroRodas);
            case "aereo":
                System.out.print("Digite o numero de motores: ");
                int numeroMotores = Integer.parseInt(ler.nextLine());
                return new VeiculoAereo(ano, cor, false, modelo, nomeVeiculo, numeroMotores);
            case "aquatico":
                System.out.print("Digite o comprimento em metros: ");
                float comprimento = Float.parseFloat(ler.nextLine());
                return new VeiculoAquatico(ano, cor, false, modelo, nomeVeiculo, comprimento);
            default:
                System.out.println("Classe não encontrada!!");
                return null;
        }
    }


    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n\n----------------------------------------------------------");
            System.out.println("| << -- Gerenciador Interativo de Frota Multimodal -- >> |");
            System.out.println("----------------------------------------------------------");
            System.out.println("|            #- [1] Cadastrar novo veiculo               |");
            System.out.println("|            #- [2] Listar todos os veiculos             |");
            System.out.println("|            #- [3] Executar ação com um veiculo         |");
            System.out.println("|            #- [0] Sair                                 |");
            System.out.println("----------------------------------------------------------");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(ler.nextLine());
            Veiculo novoVeiculo;

            switch (opcao) {
                case 1:
                    System.out.println("\n\n-----------------------------------");
                    System.out.println("|  << -- Cadastrar veiculo -- >>  |");
                    System.out.println("-----------------------------------");
                    System.out.println("|        #- [1] Terrestre         |");
                    System.out.println("|        #- [2] Aereo             |");
                    System.out.println("|        #- [3] Aquatico          |");
                    System.out.println("-----------------------------------");
                    System.out.print("#>- Escolha uma opcao: ");
                    int opCadastro = Integer.parseInt(ler.nextLine());

                    switch (opCadastro) {
                        case 1:
                            System.out.println("---------------------------------");
                            System.out.println("|  <<-- Veiculo Terrestre -->>  |");
                            System.out.println("---------------------------------");
                            novoVeiculo = pegarVeiculo("terrestre");
                            if(novoVeiculo != null) {
                                veiculos.add(novoVeiculo);
                                System.out.println(novoVeiculo.getNomeVeiculo() + " cadastrado com sucesso!!");
                            } else {
                                System.out.println("Erro ao tentar cadastra o veiculo Terrestre!!");
                            }
                        break;
                        case 2:
                            System.out.println("-----------------------------");
                            System.out.println("|  <<-- Veiculo Aereo -->>  |");
                            System.out.println("-----------------------------");
                            novoVeiculo = pegarVeiculo("aereo");
                            if(novoVeiculo != null) {
                                veiculos.add(novoVeiculo);
                                System.out.println(novoVeiculo.getNomeVeiculo() + " cadastrado com sucesso!!");
                            } else {
                                System.out.println("Erro ao tentar cadastrar o veiculo Aereo!!");
                            }
                        break;
                        case 3:
                            System.out.println("--------------------------------");
                            System.out.println("|  <<-- Veiculo Aquatico -->>  |");
                            System.out.println("--------------------------------");
                            novoVeiculo = pegarVeiculo("aquatico");
                            if(novoVeiculo != null) {
                                veiculos.add(novoVeiculo);
                                System.out.println(novoVeiculo.getNomeVeiculo() + " cadastrado com sucesso!!");
                            } else {
                                System.out.println("Erro ao tentar cadastrar o veiculo Aquatico!!");
                            }
                        break;
                    }
                break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.println("|  <<-- Todos os veiculos -->>  |");
                    System.out.println("---------------------------------");
                    for(Veiculo veiculo : veiculos) {
                        System.out.println("| --> Nome: " + veiculo.getNomeVeiculo());
                        System.out.println("| --> Cor: " + veiculo.getCor());
                        System.out.println("| --> Modelo: " + veiculo.getModelo());
                        System.out.println("| --> Ano: " + veiculo.getAno());
                        System.out.println("|");
                    }
                    System.out.println("---------------------------------");
                break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("|  <<-- Realizar Ação -->>  |");
                    System.out.println("-----------------------------");
                    System.out.println("|      #- [1] Terrestre     |");
                    System.out.println("|      #- [2] Aereo         |");
                    System.out.println("|      #- [3] Aquatico      |");
                    System.out.println("-----------------------------");
                    System.out.print("#-> Escolha o tipo do veiculo: ");
                    int tipoVeiculo = Integer.parseInt(ler.nextLine());

                    switch (tipoVeiculo) {
                        case 1:
                            System.out.println("-----------------------------------");
                            System.out.println("|  <<-- Veiculos Terrestres -->>  |");
                            System.out.println("-----------------------------------");
                            int i1 = 0;
                            for(Veiculo veiculo : veiculos) {
                                if(veiculo instanceof VeiculoTerrestre) {
                                    System.out.println("|  #- [" + (i1+=1) + "] " + veiculo.getNomeVeiculo() + " --> " + veiculo.getModelo());
                                }
                            }
                        break;
                        case 2:
                            int i2 = 0;
                            for(Veiculo veiculo : veiculos) {
                                if(veiculo instanceof VeiculoAereo) {
                                    System.out.println("|  #- [" + (i2+=1) + "] " + veiculo.getNomeVeiculo() + " --> " + veiculo.getModelo());
                                }
                            }
                        break;
                        case 3:
                            int i3 = 0;
                            for(Veiculo veiculo : veiculos) {
                                if(veiculo instanceof VeiculoAquatico) {
                                    System.out.println("|  #- [" + (i3+=1) + "] " + veiculo.getNomeVeiculo() + " --> " + veiculo.getModelo());
                                }
                            }
                        break;
                        default:
                            System.out.println("Erro -> Escolha uma opção válida!!");
                        break;
                    }

                    System.out.println("-----------------------------------");
                    System.out.print(" #-> Escolha um veiculo: ");
                    int veiculoEscolhido = Integer.parseInt(ler.nextLine());
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
            }
        }while (opcao!=0);
    }

}
