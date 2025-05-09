package Ex_veiculos;

public class Veiculo {
    String modelo;
    int ano;
    String cor;
    boolean ligado;

    Veiculo(String modelo, int ano, String cor, boolean ligado) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void acelerar() {
        System.out.println("Veiculo Acelerando");
    }

    public void frear() {
        System.out.println("Veiculo Freando!!");
    }

    public void virar(String direcao) {
        System.out.println("O veículo virou para " + direcao);
    }

}

