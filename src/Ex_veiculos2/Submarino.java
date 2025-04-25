package Ex_veiculos2;

public class Submarino extends VeiculoAquatico{

    private float profundidadeMaxima;

    Submarino(int ano, String cor, boolean ligado, String modelo, float comprimento, float profundidadeMaxima) {
        super(ano, cor, ligado, modelo, comprimento);
        this.profundidadeMaxima = profundidadeMaxima;
    }

    public void mergulhar() {
        System.out.println("Submarino mergulhando");
    }

    public void emergir() {
        System.out.println("Submarino emergindo");
    }
}
