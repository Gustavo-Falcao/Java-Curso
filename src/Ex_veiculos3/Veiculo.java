package Ex_veiculos3;

public abstract class Veiculo {

    protected int ano;
    protected String cor;
    protected boolean ligado;
    protected String modelo;
    protected String nomeVeiculo;

    Veiculo(int ano, String cor, boolean ligado, String modelo, String nomeVeiculo) {
        this.ano = ano;
        this.cor = cor;
        this.ligado = ligado;
        this.modelo = modelo;
        this.nomeVeiculo = nomeVeiculo;
    }

    abstract void ligar(String veiculo);

    abstract void desligar(String veiculo);

    public void virar(String direcao) {
        System.out.println("Veiculo virando");
    }

    public void acelerar() {
        System.out.println("Veiculo acelerando");
    }

    public void frear() {
        System.out.println("Veiculo freando");
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

}
