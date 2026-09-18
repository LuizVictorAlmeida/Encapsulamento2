package atividade2;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private int horasTrabalhadas;

    public Funcionario(String nome, String cargo, double salario, int horasTrabalhadas) {
        this.nome = nome;
        this.cargo = cargo;
        setSalario(salario);
        setHorasTrabalhadas(horasTrabalhadas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 1518.00) {
            this.salario = salario;
        } else {
            System.out.println("Erro: O salário deve ser maior que R$ 1.518,00.");
        }
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas >= 0 && horasTrabalhadas <= 220) {
            this.horasTrabalhadas = horasTrabalhadas;
        } else {
            System.out.println("Erro: As horas trabalhadas devem estar entre 0 e 220.");
        }
    }

    // Métodos de Negócio
    public void registrarHorasExtras(int horas) {
        if (horas > 0 && (this.horasTrabalhadas + horas <= 220)) {
            this.horasTrabalhadas += horas;
            System.out.println(horas + " horas extras registradas para " + nome + ".");
        } else {
            System.out.println("Erro: Quantidade de horas inválida ou ultrapassa o teto de 220h.");
        }
    }

    public double calcularSalarioComHorasExtras(int horasExtras, double valorHoraExtra) {
        if (horasExtras > 0 && valorHoraExtra > 0) {
            return this.salario + (horasExtras * valorHoraExtra);
        }
        return this.salario;
    }
}
