package Ex_veiculos;

public class Carro extends Veiculo{

    int numeroPortas;
    String tipoTransmissao;
    float capacidadePortamalas;

    Carro(String modelo, int ano, String cor, boolean ligado, int numeroPortas, String tipoTransmissao, float capacidadePortamalas) {
        super(modelo, ano, cor, ligado);
        this.numeroPortas = numeroPortas;
        this.tipoTransmissao = tipoTransmissao;
        this.capacidadePortamalas = capacidadePortamalas;
    }

    @Override
    public void ligar() {
        if(!this.ligado){
            super.ligar();
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado) {
            super.desligar();
        } else {
            System.out.println("O carro já está desligado");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando!!");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando!!");
    }

}
