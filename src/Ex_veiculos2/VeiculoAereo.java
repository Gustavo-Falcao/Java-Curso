package Ex_veiculos2;

public class VeiculoAereo extends Veiculo{

    private int numeroMotores;

    VeiculoAereo(int ano, String cor, boolean ligado, String modelo, int numeroMotores) {
        super(ano, cor, ligado, modelo);
        this.numeroMotores = numeroMotores;
    }
}
