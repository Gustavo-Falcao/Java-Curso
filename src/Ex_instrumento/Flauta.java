package Ex_instrumento;

public class Flauta extends Instrumento implements Afinador{

    Flauta(String timbre, int tamanho) {
        super(timbre, tamanho);
    }

    @Override
    void tocar() {
        System.out.println("Tocando flauta");
    }

    void tocarMelodia() {
        System.out.println("Tocando melodia na flauta");
    }

    @Override
    public void afinar() {

    }

    @Override
    public void mudarTom(String tom) {
        timbre = tom;
    }
}
