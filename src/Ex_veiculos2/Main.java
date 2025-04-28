package Ex_veiculos2;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro(2022, "Branco", false, "Corolla", 4, 4, "Dianteira", 520.34f));
        veiculos.add(new Moto(2025, "Vermelho", false, "BMW S1000", 2, 1000, "Gasolina", "ABS"));
        veiculos.add(new Submarino(2021, "Preto", false, "Tourville", 100f, 350));
        veiculos.add(new Aviao(2024, "Branco", false, "Boing 007", 2, 4, "QAV"));

        for(Veiculo veiculo : veiculos) {
            veiculo.ligar();
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("Nome da classe: " + veiculo.getClass().getName());
            if(veiculo instanceof Carro carro) {
                carro.ligarFarolNeblina();
            }
            else if(veiculo instanceof Moto moto) {
                moto.ativarModoEsportivo();
            }
            else if(veiculo instanceof Submarino submarino) {
                submarino.mergulhar();
            }
            else if(veiculo instanceof Aviao aviao) {
                aviao.decolar();
            }
            veiculo.desligar();
            System.out.println();
        }

    }
}
