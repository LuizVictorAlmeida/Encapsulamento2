package atividade3;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int estoque;

    public Produto(String nome, String categoria, double preco, int estoque) {
        this.nome = nome;
        this.categoria = categoria;
        setPreco(preco);
        setEstoque(estoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço deve ser maior que zero.");
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("Erro: Estoque não pode ser negativo.");
        }
    }

    // Métodos de Negócio
    public void entradaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println("Entrada de " + quantidade + " un. do produto " + nome + ". Estoque atual: " + estoque);
        } else {
            System.out.println("Erro: Quantidade de entrada deve ser maior que zero.");
        }
    }

    public void saidaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            System.out.println("Saída de " + quantidade + " un. do produto " + nome + ". Estoque atual: " + estoque);
        } else {
            System.out.println("Erro: Quantidade inválida ou estoque insuficiente para " + nome + ".");
        }
    }
}
