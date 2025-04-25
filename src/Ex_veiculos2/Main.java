package Ex_veiculos2;

public class Main {

    public static void main(String[] args) {
        //VeiculoTerrestre carro = new VeiculoTerrestre(2020, "Branco", true, "Nissan GTR", 4);

        Carro carro1 = new Carro(2024, "Preto", true, "Nissan GTR", 4, 4, "Dianteira", 475.34f);

        carro1.mostrarInfoCarro();
    }
}
