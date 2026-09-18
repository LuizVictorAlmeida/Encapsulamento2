package atividades.atividade4;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidade;
    private boolean disponivel;

    public Livro(String titulo, String autor, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        setQuantidade(quantidade);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
            this.disponivel = (quantidade > 0);
        } else {
            System.out.println("Erro: A quantidade não pode ser negativa.");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Métodos de Negócio
    public void emprestarLivro() {
        if (this.quantidade > 0) {
            setQuantidade(this.quantidade - 1);
            System.out.println("Livro '" + titulo + "' emprestado com sucesso!");
        } else {
            System.out.println("Erro: O livro '" + titulo + "' não está disponível para empréstimo.");
        }
    }

    public void devolverLivro() {
        setQuantidade(this.quantidade + 1);
        System.out.println("Livro '" + titulo + "' devolvido com sucesso!");
    }

    public void consultarDisponibilidade() {
        System.out.println("Livro: " + titulo + " | Disponível: " + (disponivel ? "Sim (" + quantidade + " un.)" : "Não"));
    }
}