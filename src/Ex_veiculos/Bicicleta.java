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
}
