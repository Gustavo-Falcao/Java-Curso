package Ex_instrumento;

public abstract class Instrumento {

    protected String timbre;
    protected int tamanho;

    Instrumento(String timbre, int tamanho) {
        this.timbre = timbre;
        this.tamanho = tamanho;
    }

    abstract void tocar();
}
