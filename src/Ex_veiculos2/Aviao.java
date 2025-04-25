package Ex_veiculos2;

public class Aviao extends VeiculoAereo{

    private float envergaduraAsa;
    private String tipoCombustivel;

    Aviao(int ano, String cor, boolean ligado, String modelo, int numeroMotores, float envergaduraAsa, String tipoCombustivel) {
        super(ano, cor, ligado, modelo, numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void decolar() {
        System.out.println("Avião decolando");
    }

    public void pousar() {
        System.out.println("Avião pousando");
    }
}
