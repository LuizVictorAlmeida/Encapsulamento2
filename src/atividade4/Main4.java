package atividade4;

public class Main4 {
    public static void main (String[] args){
        System.out.println("--- 4 Teste de Livro ---");
        Livro livro = new Livro("Harry Potter", "J. K. Rowling", 1);
        livro.consultarDisponibilidade();
        livro.emprestarLivro();
        livro.emprestarLivro();       // Deve acusar indisponível
        livro.devolverLivro();
        System.out.println();
    }
}
