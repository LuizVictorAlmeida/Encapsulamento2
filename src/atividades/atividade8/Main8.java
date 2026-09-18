package atividades.atividade8;

import java.time.LocalDate;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("--- 8 Teste de Medicamento ---");
        Medicamento med = new Medicamento("Tylenol sinus", "Johnson & Johnson", 50, LocalDate.now().plusMonths(12));
        med.baixaMedicamentos(10);
        med.setValidade(LocalDate.of(2020, 1, 1)); // Deve barrar data passada
        System.out.println();
    }
}
