package atividades.atividade9;

public class Evento {
    private String nomeEvento;
    private int capacidade;
    private int ingressosVendidos;
    private double precoIngresso;

    public Evento(String nomeEvento, int capacidade, double precoIngresso) {
        this.nomeEvento = nomeEvento;
        setCapacidade(capacidade);
        setPrecoIngresso(precoIngresso);
        this.ingressosVendidos = 0;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("Erro: Capacidade deve ser maior que zero.");
        }
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        if (ingressosVendidos >= 0 && ingressosVendidos <= this.capacidade) {
            this.ingressosVendidos = ingressosVendidos;
        } else {
            System.out.println("Erro: Ingressos vendidos não podem ultrapassar a capacidade nem ser negativos.");
        }
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        if (precoIngresso >= 0) {
            this.precoIngresso = precoIngresso;
        } else {
            System.out.println("Erro: Preço do ingresso não pode ser negativo.");
        }
    }

    // Métodos de Negócio
    public void venderIngresso(int quantidade) {
        if (quantidade > 0 && (this.ingressosVendidos + quantidade) <= this.capacidade) {
            this.ingressosVendidos += quantidade;
            System.out.println(quantidade + " ingresso(s) vendido(s) para o evento " + nomeEvento + "!");
        } else {
            System.out.println("Erro: Não é possível vender acima da capacidade total ou quantidade inválida.");
        }
    }

    public void cancelarIngresso(int quantidade) {
        if (quantidade > 0 && quantidade <= this.ingressosVendidos) {
            this.ingressosVendidos -= quantidade;
            System.out.println(quantidade + " ingresso(s) cancelado(s) com sucesso.");
        } else {
            System.out.println("Erro: Quantidade inválida para cancelamento.");
        }
    }

    public void mostrarVagasDisponiveis() {
        int vagas = this.capacidade - this.ingressosVendidos;
        System.out.println("Vagas disponíveis para '" + nomeEvento + "': " + vagas + " de " + capacidade);
    }
}
