package Ex_veiculos;

public class Onibus extends Veiculo{

    int capacidadePassageiros;
    int portasAcesso;
    int numeroParadas;

    Onibus(String modelo, int ano, String cor, boolean ligado, int capacidadePassageiros, int portasAcesso, int numeroParadas) {
        super(modelo, ano, cor, ligado);
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

    @Override
    public void acelerar() {
        System.out.println("Onibus acelerando!!");
    }

    @Override
    public void frear() {
        System.out.println("Onibus freando!!");
    }
}
