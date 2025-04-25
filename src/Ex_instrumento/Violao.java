package Ex_instrumento;

public class Violao extends Instrumento implements Afinador{

    private int numeroCordas;

    Violao(String tom, int tamanho, int numeroCordas) {
        super(tom, tamanho);
        this.numeroCordas = numeroCordas;
    }

    @Override
    void tocar() {
        System.out.println("Tocando violão");
    }

    void tocarAcorde() {
        System.out.println("Tocando acorde no violão");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando violão");
    }

    @Override
    public void mudarTom(String tom) {
        timbre = tom;
    }
}
