package Hierarquia;

public class Animal {
   protected String nome;

   public void mostrarNome() {
       System.out.println(this.nome);
   }

   public void mudarNome(String nome) {
       this.nome = nome;
   }

   public void fazerSom() {
       System.out.println("Som generico");
   }
}
