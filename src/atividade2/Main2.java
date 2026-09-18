package atividade2;

public class Main2 {
    public static void main (String[] args){
        System.out.println("--- 2 Teste de Funcionário ---");
        Funcionario func = new Funcionario("João Bispo", "Desenvolvedor", 4000.0, 160);
        func.registrarHorasExtras(20);
        System.out.println("Salário total com 10h extras: R$ " + func.calcularSalarioComHorasExtras(10, 50.0));
        func.setSalario(1200.0);     // Deve barrar (menor que R$ 1.518,00)
        System.out.println();
    }
}