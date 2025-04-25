package Ex_veiculos2;

public abstract class VeiculoTerrestre extends Veiculo{

    protected int numeroRodas;

    VeiculoTerrestre(int ano, String cor, boolean ligado, String modelo, int numeroRodas) {
        super(ano, cor, ligado, modelo);
        this.numeroRodas = numeroRodas;
    }
}
