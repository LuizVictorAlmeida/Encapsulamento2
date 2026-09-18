package atividades.atividade1;

import java.time.Year;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int ano, double quilometragem) {
        setPlaca(placa);
        this.modelo = modelo;
        setAno(ano);
        setQuilometragem(quilometragem);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro: A placa não pode estar vazia.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        int anoAtual = Year.now().getValue();
        if (ano >= 1990 && ano <= anoAtual) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano inválido (" + ano + "). Deve ser entre 1990 e " + anoAtual + ".");
        }
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        if (quilometragem >= 0) {
            this.quilometragem = quilometragem;
        } else {
            System.out.println("Erro: Quilometragem não pode ser negativa.");
        }
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.println("Viagem de " + km + " km registrada no veículo " + modelo + ".");
        } else {
            System.out.println("Erro: Quilometragem da viagem deve ser maior que zero.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Veículo: " + modelo + " | Placa: " + placa + " | Ano: " + ano + " | KM: " + quilometragem);
    }
}
