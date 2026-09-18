package atividades.atividade10;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("--- 10 Teste de Equipamento SENAI ---");
        Equipamento eq = new Equipamento("SENAI-6769", "Notebook Dell i7", "Biblioteca");
        eq.emprestarEquipamento();
        eq.emprestarEquipamento();    // Deve acusar que já está em uso
        eq.enviarParaManutencao();
        eq.liberarEquipamento();
        eq.setStatus("Quebrado");     // Deve barrar status fora do padrão
    }
}
