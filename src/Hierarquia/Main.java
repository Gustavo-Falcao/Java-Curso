package Hierarquia;

public class Main {

    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.mudarNome("Jeff");
        cat.mostrarNome();

        System.out.println();

        Animal cachorro = new Animal();
        cachorro.mudarNome("Doguinho");
        cachorro.mostrarNome();

        cat.mudarNomeGato("Joee");
        cat.mostrarNome();

        Cachorro dog = new Cachorro();
        dog.mudarNome("Ruffulss");
        dog.fazerSom();

        cachorro.fazerSom();
        cat.fazerSom();
    }
}
