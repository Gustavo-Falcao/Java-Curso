package Ex_instrumento;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void musico(Instrumento instrumentoTocado) {
        instrumentoTocado.tocar();
    }


    public static void main(String[] args) {
        Violao vi = new Violao("dó", 15, 5);
        Flauta fla = new Flauta("agudo", 4);

        musico(fla);

//        vi.tocar();
//        vi.tocarAcorde();
//        vi.afinar();
//
//        fla.tocar();
//        fla.tocarMelodia();
//        fla.afinar();
//        fla.mudarTom("grosso");

//        List<Instrumento> instrumentos = new ArrayList<>();
//        instrumentos.add(vi);
//        instrumentos.add(fla);
//
//        List<Afinador> instrumentosAf = new ArrayList<>();
//        instrumentosAf.add(vi);
//        instrumentosAf.add(fla);

    }
}
