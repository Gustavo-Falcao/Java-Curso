package Ex_veiculos;

public class Moto extends Veiculo{

    int cilindradas;
    String tipoCombustivel;
    String tipoFreio;

    Moto(String modelo, int ano, String cor, boolean ligado, int cilindradas, String tipoCombustivel, String tipoFreio) {
        super(modelo, ano, cor, ligado);
        this.cilindradas = cilindradas;
        this.tipoCombustivel = tipoCombustivel;
        this.tipoFreio = tipoFreio;
    }

    @Override
    public void ligar() {
        if(!this.ligado){
            super.ligar();
        } else {
            System.out.println("A moto já está ligada");
        }
    }

    @Override
    public void desligar() {
        if(this.ligado) {
            super.desligar();
        } else {
            System.out.println("A moto já está desligada");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando!!");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando!!");
    }

}
