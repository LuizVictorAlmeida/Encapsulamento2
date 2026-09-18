package atividades.atividade7;

public class Reserva {
    private String hospede;
    private int quarto;
    private int dias;
    private double valorDiaria;

    public Reserva(String hospede, int quarto, int dias, double valorDiaria) {
        this.hospede = hospede;
        this.quarto = quarto;
        setDias(dias);
        setValorDiaria(valorDiaria);
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        if (dias > 0) {
            this.dias = dias;
        } else {
            System.out.println("Erro: A quantidade de dias deve ser maior que zero.");
        }
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        } else {
            System.out.println("Erro: O valor da diária deve ser maior que zero.");
        }
    }

    // Métodos de Negócio
    public double calcularValorHospedagem() {
        return this.dias * this.valorDiaria;
    }

    public void alterarQuantidadeDias(int novosDias) {
        setDias(novosDias);
        System.out.println("Reserva do quarto " + quarto + " atualizada para " + this.dias + " dias.");
    }
}
