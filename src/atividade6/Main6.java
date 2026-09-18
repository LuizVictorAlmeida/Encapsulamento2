package atividade6;

public class Main6 {
    public static void main (String[] args){
        System.out.println("--- 6 Teste de Pedido ---");
        Pedido pedido = new Pedido(67, "Guilherme", 67.67);
        pedido.avancarStatus();       // Avança para Preparando
        pedido.avancarStatus();       // Avança para Pronto
        pedido.setStatus("Invalido"); // Deve barrar
        pedido.cancelarPedido();
        System.out.println();
    }
}
