package exemplos;

// =======================================================
// CLASSE: Aluno (Encapsulada)
// =======================================================
class Aluno {
    // Atributos privados
    private String nome;
    private int idade;
    private double notaFinal;
    // Construtor
    public Aluno(String nome, int idade, double notaFinal) {
        this.nome = nome;
        setIdade(idade); // Usa o setter para aplicar as regras de validação
        setNotaFinal(notaFinal); // Usa o setter para aplicar as regras de validação
    }
    // --- GETTERS E SETTERS ---
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    // Validação: Idade deve ser um valor plausível
    public void setIdade(int idade) {
        if (idade >= 14 && idade <= 100) {
            this.idade = idade;
        } else {
            System.out.println("Erro: Idade inválida para o aluno " + this.nome + " (" + idade + " anos).");
        }
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    // Validação: Nota entre 0.0 e 10.0
    public void setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 10.0) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }
    // Método para exibir dados do aluno
    public void exibirInformacoes() {
        System.out.println("Aluno: " + nome + " | Idade: " + idade + " | Nota: " + notaFinal);
    }
}
// =======================================================
// CLASSE PRINCIPAL (Main)
// =======================================================
public class MainE2 {
    public static void main(String[] args) {
        System.out.println("=== ENCAPSULAMENTO - CADASTRO DE ALUNO ===\n");
        // Criando aluno com dados válidos
        Aluno aluno1 = new Aluno("Mariana", 18, 9.5);
        aluno1.exibirInformacoes();
        System.out.println("\n--- Testando alterações e validações via Setters ---");

        // Alterando para valores inválidos
        aluno1.setIdade(-5); // Exibe erro
        aluno1.setNotaFinal(15.0); // Exibe erro
        // Como a validação bloqueou, os dados antigos se mantêm protegidos
        System.out.println("\n--- Estado do Aluno Após Tentativas Inválidas ---");
        aluno1.exibirInformacoes();
    }
}
