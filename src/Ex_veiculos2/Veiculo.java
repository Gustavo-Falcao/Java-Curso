package Ex_veiculos2;

public abstract class Veiculo {

    protected int ano;
    protected String cor;
    protected boolean ligado;
    protected String modelo;

    protected Veiculo(int ano, String cor, boolean ligado, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.ligado = ligado;
        this.modelo = modelo;
    }

    abstract void ligar();

    abstract void desligar();

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

}
