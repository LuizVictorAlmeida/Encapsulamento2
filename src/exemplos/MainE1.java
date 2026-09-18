package exemplos;

// =======================================================
// CLASSE: ContaBancaria (Demonstrando Encapsulamento)
// =======================================================
class ContaBancaria {
    // 1. Atributos PRIVADOS (Protegidos contra alteração direta externa)
    private String titular;
    private double saldo;
    // 2. Método Construtor: Inicializa o objeto com validação inicial
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        // Garante que a conta não comece com saldo negativo
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Aviso: Saldo inicial inválido. Defenido como R$ 0,00.");
        }
    }
    // 3. GETTERS (Apenas Leitura)
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    // 4. SETTER com Validação (Alterar Nome do Titular)
    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Erro: Nome do titular não pode ser vazio.");
        }
    }
    // 5. Métodos com Regras de Negócio que controlam a alteração do saldo
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor de saque inválido.");
        }
    }
}
// =======================================================
// CLASSE PRINCIPAL (Main)
// =======================================================
public class MainE1 {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE ENCAPSULAMENTO ===\n");
        // Criando uma conta com saldo inicial de R$ 500.00
        ContaBancaria conta = new ContaBancaria("Carlos Silva", 500.0);
        // Tentativa de alterar o saldo DIRETAMENTE (Isso gera erro de compilação!):
        // conta.saldo = 10000.0; // ERRO! saldo é private.
        // Lendo informações via Getters
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo Inicial: R$ " + conta.getSaldo());
        System.out.println("-----------------------------------");
        // Testando operações seguras
        conta.depositar(200.0); // Novo saldo: 700.0
        conta.sacar(150.0); // Novo saldo: 550.0
        // Testando tentativa de operação INVÁLIDA (Regra de validação barra a ação)
        System.out.println("\n--- Tentando realizar operações inválidas ---");
        conta.sacar(1000.0); // Deve exibir erro de saldo insuficiente
        conta.depositar(-50.0); // Deve exibir erro de depósito inválido
        System.out.println("-----------------------------------");
        System.out.println("Saldo Final Confirmado: R$ " + conta.getSaldo());
    }
}
