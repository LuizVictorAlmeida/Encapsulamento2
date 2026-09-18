package atividades.atividade5;

public class Main5 {
    public static void main (String[] args){
        System.out.println("--- 5 Teste de Cliente ---");
        Cliente cliente = new Cliente("Luiz Victor", "12345678901", "luiz.victor@email.com", "(11) 99999-9999");
        cliente.atualizarEmail("luiz.almeida@email.com");
        cliente.setEmail("emailSemArroba.com"); // Deve barrar
        cliente.setCpf("123");                  // Deve barrar
        System.out.println();
    }
}
