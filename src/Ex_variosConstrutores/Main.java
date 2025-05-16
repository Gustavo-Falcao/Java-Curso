package Ex_variosConstrutores;

public class Main {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gustavo", 20, "124.476.559-75", 1, "(41)984029990", "duartegusfalcao@gmail.com");
        Cliente c2 = new Cliente("Pedro", 15, "324.554.786-65", 2);
        Cliente c3 = new Cliente("Ricardo", "342.456.556-09", 3);

        c1.mostrarInfoCliente();
        System.out.println();
        c2.mostrarInfoCliente();
        System.out.println();
        c3.mostrarInfoCliente();
    }
}
