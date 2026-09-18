package atividade10;

public class Equipamento {
    private String patrimonio;
    private String descricao;
    private String status; // Disponível, Em Uso, Manutenção
    private String laboratorio;

    public Equipamento(String patrimonio, String descricao, String laboratorio) {
        setPatrimonio(patrimonio);
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.status = "Disponível";
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        if (patrimonio != null && !patrimonio.trim().isEmpty()) {
            this.patrimonio = patrimonio;
        } else {
            System.out.println("Erro: O patrimônio é obrigatório.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("Disponível") ||
                status.equalsIgnoreCase("Em Uso") ||
                status.equalsIgnoreCase("Manutenção")) {
            this.status = status;
        } else {
            System.out.println("Erro: Status inválido. Opções válidas: Disponível, Em Uso, Manutenção.");
        }
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    // Métodos de Negócio
    public void emprestarEquipamento() {
        if (this.status.equalsIgnoreCase("Disponível")) {
            this.status = "Em Uso";
            System.out.println("Equipamento (" + descricao + " - Pat: " + patrimonio + ") emprestado com sucesso!");
        } else {
            System.out.println("Erro: O equipamento não pode ser emprestado. Status atual: " + this.status);
        }
    }

    public void enviarParaManutencao() {
        this.status = "Manutenção";
        System.out.println("Equipamento (" + descricao + ") enviado para Manutenção.");
    }

    public void liberarEquipamento() {
        this.status = "Disponível";
        System.out.println("Equipamento (" + descricao + ") agora está Disponível para uso.");
    }
}
