package Ex_veiculos3;

public class VeiculoTerrestre extends Veiculo {

    protected int numeroRodas;

    VeiculoTerrestre(int ano, String cor, boolean ligado, String modelo, String nomeVeiculo, int numeroRodas) {
        super(ano, cor, ligado, modelo, nomeVeiculo);
        this.numeroRodas = numeroRodas;
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

    public void ligarFarol(String veiculo) {
        System.out.println("Farol ligado do " + veiculo);
    }
}
