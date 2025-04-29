package Ex_veiculos3;


public class VeiculoAquatico extends Veiculo{

    private float comprimento;

    VeiculoAquatico(int ano, String cor, boolean ligado, String modelo, String nomeVeiculo, float comprimento) {
        super(ano, cor, ligado, modelo, nomeVeiculo);
        this.comprimento = comprimento;
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
