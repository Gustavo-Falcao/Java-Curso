package Ex_veiculos3;

import java.util.ArrayList;
import java.util.HashMap;
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
        HashMap<String,Veiculo> veiculos = new HashMap<>();
        int numId = 1;
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
                                veiculos.put("K" + (numId++) + " ",novoVeiculo);
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
                                veiculos.put("K" + (numId++) + " ",novoVeiculo);
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
                                veiculos.put("K" + (numId++) + " ",novoVeiculo);
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
                    for(String chave : veiculos.keySet()) {
                        System.out.println("| --> ID Veiculo: " + chave);
                        System.out.println("| --> Nome: " + veiculos.get(chave).getNomeVeiculo());
                        System.out.println("| --> Cor: " + veiculos.get(chave).getCor());
                        System.out.println("| --> Modelo: " + veiculos.get(chave).getModelo());
                        System.out.println("| --> Ano: " + veiculos.get(chave).getAno());
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
                    String nomeTipoVeiculo = "";

                    switch (tipoVeiculo) {
                        case 1:
                            System.out.println("-----------------------------------");
                            System.out.println("|  <<-- Veiculos Terrestres -->>  |");
                            System.out.println("-----------------------------------");
                            for(String chave : veiculos.keySet()) {
                                if(veiculos.get(chave) instanceof VeiculoTerrestre veiculoTerrestre) {
                                    System.out.println("|  #- [" + chave + "] " + veiculoTerrestre.getNomeVeiculo() + " --> " + veiculoTerrestre.getModelo());
                                }
                            }
                            nomeTipoVeiculo = "Terrestre";
                        break;
                        case 2:
                            System.out.println("-------------------------------");
                            System.out.println("|  <<-- Veiculos Aereos -->>  |");
                            System.out.println("-------------------------------");
                            for(String chave : veiculos.keySet()) {
                                if(veiculos.get(chave) instanceof VeiculoAereo veiculoAereo) {
                                    System.out.println("|  #- [" + chave + "] " + veiculoAereo.getNomeVeiculo() + " --> " + veiculoAereo.getModelo());
                                }
                            }
                            nomeTipoVeiculo = "Aereo";
                        break;
                        case 3:
                            System.out.println("----------------------------------");
                            System.out.println("|  <<-- Veiculos Aquaticos -->>  |");
                            System.out.println("----------------------------------");
                            for(String chave : veiculos.keySet()) {
                                if(veiculos.get(chave) instanceof VeiculoAquatico veiculoAquatico) {
                                    System.out.println("|  #- [" + chave + "] " + veiculoAquatico.getNomeVeiculo() + " --> " + veiculoAquatico.getModelo());
                                }
                            }
                            nomeTipoVeiculo = "Aquatico";
                        break;
                        default:
                            System.out.println("Erro -> Escolha uma opção válida!!");
                        break;
                    }

                    System.out.println("-----------------------------------");
                    System.out.print(" #-> Escolha um veiculo digitando o ID ao lado dele: ");
                    String idVeiculoEscolhido = ler.nextLine();

                    if(veiculos.containsKey(idVeiculoEscolhido)) {
                        switch (nomeTipoVeiculo) {
                            case "Terrestre":
                                VeiculoTerrestre vTerrestre = (VeiculoTerrestre) veiculos.get(idVeiculoEscolhido);
                                System.out.println("-------------------------------------------");
                                System.out.println("|  <<-- Ações do Veiculo Terrestre  -->>  |");
                                System.out.println("-------------------------------------------");
                                System.out.println("|           #- [1] Ligar Farol            |");
                                System.out.println("|           #- [0] Sair                   |");
                                System.out.println("-------------------------------------------");
                                System.out.print("#-> Escolha uma opção: ");
                                int opAcao = Integer.parseInt(ler.nextLine());

                                if(opAcao == 1) {
                                    vTerrestre.ligarFarol("Carro");
                                }
                                else if(opAcao == 0 ) {
                                    System.out.println("Saindo...");
                                }
                            break;
                        }
                    }
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
            }
        }while (opcao!=0);
    }

}
