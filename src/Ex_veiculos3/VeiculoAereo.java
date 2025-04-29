package Ex_veiculos3;


public class VeiculoAereo extends Veiculo {

    private int numeroMotores;

    VeiculoAereo(int ano, String cor, boolean ligado, String modelo, String nomeVeiculo, int numeroMotores) {
        super(ano, cor, ligado, modelo, nomeVeiculo);
        this.numeroMotores = numeroMotores;
    }

    @Override
    void ligar(String veiculo) {
        if(!this.ligado) {
            ligado = true;
            System.out.println(veiculo + " ligado");
        } else {
            System.out.println(veiculo + "já está ligado");
        }
    }

    @Override
    void desligar(String veiculo) {
        if(this.ligado) {
            ligado = false;
            System.out.println(veiculo + " desligado");
        } else {
            System.out.println(veiculo + " já está desligado");
        }
    }
}
