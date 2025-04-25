package Ex_veiculos2;

public class Veiculo {

    protected int ano;
    protected String cor;
    protected boolean ligado;
    protected String modelo;

    Veiculo(int ano, String cor, boolean ligado, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.ligado = ligado;
        this.modelo = modelo;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void virar(String direcao) {
        System.out.println("Veiculo virando");
    }

    public void acelerar() {
        System.out.println("Veiculo acelerando");
    }

    public void frear() {
        System.out.println("Veiculo freando");
    }

}
