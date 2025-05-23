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

    @Override
    public void virar(String direcao) {
        System.out.println("O carro virou para " + direcao);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public float getCapacidadePortamalas() {
        return capacidadePortamalas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    public void setCapacidadePortamalas(float capacidadePortamalas) {
        this.capacidadePortamalas = capacidadePortamalas;
    }

    public void ligarFarolNeblina() {
        System.out.println("Farou de neblina ligado");
    }

    public void abrirTetoSolar() {
        System.out.println("Teto solar aberto");
    }
}
