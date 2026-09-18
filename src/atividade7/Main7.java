package atividade7;

public class Main7 {
    public static void main(String[]args){
        System.out.println("--- 7 Teste de Reserva ---");
        Reserva reserva = new Reserva("Pedro Anastacio", 67, 3, 150.0);
        System.out.println("Total da reserva: R$ " + reserva.calcularValorHospedagem());
        reserva.alterarQuantidadeDias(5);
        System.out.println("Novo total: R$ " + reserva.calcularValorHospedagem());
        reserva.setDias(-2);          // Deve barrar
        System.out.println();
    }
}
