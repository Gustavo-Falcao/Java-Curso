package Hierarquia;

public class Gato extends Animal{

    public void mudarNomeGato(String nome) {
        mudarNome(nome);
    }

    @Override
    public void fazerSom() {
       // super.fazerSom();
        System.out.println("Som de gato");
    }
}
