package Ex_veiculos2;

import Ex_veiculos.Veiculo;

public class Onibus extends VeiculoTerrestre {

    int capacidadePassageiros;
    int portasAcesso;
    int numeroParadas;

    Onibus(int ano, String cor, boolean ligado, String modelo, int numeroRodas, int capacidadePassageiros, int portasAcesso, int numeroParadas) {
        super(ano, cor, ligado, modelo ,numeroRodas);
        this.capacidadePassageiros = capacidadePassageiros;
        this.portasAcesso = portasAcesso;
        this.numeroParadas = numeroParadas;
    }

    @Override
    public void ligar() {
        if(!this.ligado){
            super.ligar();
        } else {
            System.out.println("O onibus já está ligado");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado) {
            super.desligar();
        } else {
            System.out.println("O onibus já está desligado");
        }
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getPortasAcesso() {
        return portasAcesso;
    }

    public void setPortasAcesso(int portasAcesso) {
        this.portasAcesso = portasAcesso;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public void abrirPortaDianteira() {
        System.out.println("Porta dianteira aberta");
    }

    public void anunciarParadaProxima() {
        System.out.println("Parada proxima anunciada");
    }
}
