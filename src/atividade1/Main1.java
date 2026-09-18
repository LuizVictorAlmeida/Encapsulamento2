package atividade1;

public class Main1 {
    public static void main(String[] args){
     System.out.println("--- 1 Teste de Veículo ---");
    Veiculo carro = new Veiculo("ABC-1234", "Accord", 1991, 186000);
        carro.exibirInformacoes();
        carro.registrarViagem(150);
        carro.setQuilometragem(-10); // Deve barrar
        carro.setAno(1980);          // Deve barrar
        System.out.println();
    }
}
