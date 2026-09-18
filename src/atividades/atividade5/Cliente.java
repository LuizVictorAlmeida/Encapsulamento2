package atividades.atividade5;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String email, String telefone) {
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: O nome é obrigatório.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Remove pontuações caso venha formatado
        String cpfLimpo = (cpf != null) ? cpf.replaceAll("\\D", "") : "";
        if (cpfLimpo.length() == 11) {
            this.cpf = cpfLimpo;
        } else {
            System.out.println("Erro: CPF deve conter exatamente 11 dígitos numéricos.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Erro: E-mail inválido. Deve conter '@'.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos de Negócio
    public void atualizarTelefone(String novoTelefone) {
        setTelefone(novoTelefone);
        System.out.println("Telefone de " + nome + " atualizado para: " + novoTelefone);
    }

    public void atualizarEmail(String novoEmail) {
        setEmail(novoEmail);
        System.out.println("E-mail de " + nome + " atualizado com sucesso.");
    }
}