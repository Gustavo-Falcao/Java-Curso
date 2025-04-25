package Ex_veiculos2;

public class Carro extends VeiculoTerrestre {

    int numeroPortas;
    String tipoTransmissao;
    float capacidadePortamalas;

    Carro(int ano, String cor, boolean ligado, String modelo, int numeroRodas, int numeroPortas, String tipoTransmissao, float capacidadePortamalas) {
        super(ano, cor, ligado, modelo, numeroRodas);
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

    public void mostrarInfoCarro() {
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        if(this.ligado) {
            System.out.println("Carro está ligado");
        }else {
            System.out.println("Carro está desligado");
        }
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Numero de rodas: " + this.numeroRodas);
        System.out.println("Numero de portas: " + this.numeroPortas);
        System.out.println("Tipo de transmissão: " + this.tipoTransmissao);
        System.out.println("Capacidade do portamalas: " + this.capacidadePortamalas);
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
