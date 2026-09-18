package atividades.atividade8;

import java.time.LocalDate;

public class Medicamento {
    private String nome;
    private String fabricante;
    private int quantidade;
    private LocalDate validade;

    public Medicamento(String nome, String fabricante, int quantidade, LocalDate validade) {
        this.nome = nome;
        this.fabricante = fabricante;
        setQuantidade(quantidade);
        setValidade(validade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: Quantidade deve ser maior ou igual a zero.");
        }
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        if (validade != null && !validade.isBefore(LocalDate.now())) {
            this.validade = validade;
        } else {
            System.out.println("Erro: A data de validade não pode ser anterior à data atual.");
        }
    }

    // Métodos de Negócio
    public void entradaMedicamentos(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.println("Entrada de " + qtd + " unidades do medicamento " + nome + ".");
        } else {
            System.out.println("Erro: Quantidade de entrada deve ser positiva.");
        }
    }

    public void baixaMedicamentos(int qtd) {
        if (qtd > 0 && qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.println("Baixa de " + qtd + " unidades do medicamento " + nome + ".");
        } else {
            System.out.println("Erro: Quantidade insuficiente ou inválida para dar baixa.");
        }
    }
}