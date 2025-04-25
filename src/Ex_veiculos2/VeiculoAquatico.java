package Ex_veiculos2;

public class VeiculoAquatico extends Veiculo{

    private float comprimento;

    VeiculoAquatico(int ano, String cor, boolean ligado, String modelo, float comprimento) {
        super(ano, cor, ligado, modelo);
        this.comprimento = comprimento;
    }
}
