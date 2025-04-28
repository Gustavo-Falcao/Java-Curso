package Ex_veiculos2;

public class Submarino extends VeiculoAquatico{

    private float profundidadeMaxima;

    Submarino(int ano, String cor, boolean ligado, String modelo, float comprimento, float profundidadeMaxima) {
        super(ano, cor, ligado, modelo, comprimento);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    @Override
    void ligar() {
        if(!this.ligado){
            ligado = true;
            System.out.println("Submarino ligado");
        } else {
            System.out.println("Submarino já está desligado");
        }
    }

    @Override
    void desligar(){
        if(this.ligado) {
            ligado = false;
            System.out.println("Submarino desligado");
        } else {
            System.out.println("O submarino já está desligado");
        }
    }

    public void mergulhar() {
        System.out.println("Submarino mergulhando");
    }

    public void emergir() {
        System.out.println("Submarino emergindo");
    }
}
