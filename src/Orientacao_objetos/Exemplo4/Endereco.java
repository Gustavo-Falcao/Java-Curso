package Orientacao_objetos.Exemplo4;

public class Endereco {

    private String rua;
    private String bairro;
    private String cidade;
    private int numero;

    Endereco(String rua, String bairro, String cidade, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    public void mostrarEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Numero: " + numero);
    }
}
