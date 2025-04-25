package Ex_veiculos;

public class Bicicleta extends Veiculo{

    int numeroMarchas;
    String tipoFreio;
    String estiloQuadro;

    Bicicleta(String modelo, int ano, String cor, boolean ligado, int numeroMarchas, String tipoFreio, String estiloQuadro) {
        super(modelo, ano, cor, ligado);
        this.numeroMarchas = numeroMarchas;
        this.tipoFreio = tipoFreio;
        this.estiloQuadro = estiloQuadro;
    }

    @Override
    public void acelerar() {
        System.out.println("BIKE acelerando!!");
    }

    @Override
    public void frear() {
        System.out.println("BIKE freando!!");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("A bicicleta virou para " + direcao);
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public String getEstiloQuadro() {
        return estiloQuadro;
    }

    public void setEstiloQuadro(String estiloQuadro) {
        this.estiloQuadro = estiloQuadro;
    }

    public void pedalar() {
        System.out.println("Pedalando");
    }

    public void parar() {
        System.out.println("Bike parando");
    }
}
