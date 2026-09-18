package atividades.atividade3;

public class Main3 {
    public static void main (String[] args){
        System.out.println("--- 3 Teste de Produto ---");
        Produto prod = new Produto("Teclado Mecânico", "Perifericos", 250.0, 20);
        prod.saidaEstoque(5);
        prod.entradaEstoque(10);
        prod.setPreco(-50);          // Deve barrar
        prod.saidaEstoque(100);       // Deve barrar (estoque insuficiente)
        System.out.println();

    }
}
