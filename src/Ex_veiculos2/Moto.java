package Ex_veiculos2;

import Ex_veiculos.Veiculo;

public class Moto extends VeiculoTerrestre {

    int cilindradas;
    String tipoCombustivel;
    String tipoFreio;

    Moto(int ano, String cor, boolean ligado, String modelo, int numeroRodas, int cilindradas, String tipoCombustivel, String tipoFreio) {
        super(ano, cor, ligado, modelo, numeroRodas);
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

    @Override
    public void virar(String direcao) {
        System.out.println("A moto virou para " + direcao);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    public void ativarModoEsportivo() {
        System.out.println("Modo esportivo ligado");
    }

    public void ligarPartidaEletrica() {
        System.out.println("Partida eletrica ligada");
    }
}
