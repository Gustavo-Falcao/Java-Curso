package Ex_veiculos2;

public class Aviao extends VeiculoAereo{

    private float envergaduraAsa;
    private String tipoCombustivel;

    Aviao(int ano, String cor, boolean ligado, String modelo, int numeroMotores, float envergaduraAsa, String tipoCombustivel) {
        super(ano, cor, ligado, modelo, numeroMotores);
        this.envergaduraAsa = envergaduraAsa;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    void ligar(){
        if(!this.ligado){
            ligado = true;
            System.out.println("O aviao ligou");
        } else {
            System.out.println("O aviao já está ligado");
        }
    }

    @Override
    void desligar(){
        if(this.ligado){
            ligado = false;
            System.out.println("O aviao desligou");
        } else {
            System.out.println("O aviao já está desligado");
        }
    }

    public void decolar() {
        System.out.println("Avião decolando");
    }

    public void pousar() {
        System.out.println("Avião pousando");
    }
}
