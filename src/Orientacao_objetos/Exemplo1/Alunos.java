package Orientacao_objetos.Exemplo1;

public class Alunos {
    String nome;
    Double nota1;
    Double nota2;

    void mostrarMedia() {
        double media = (nota1 + nota2) / 2;
        System.out.println("Media do aluno: " + media);
    }

}
