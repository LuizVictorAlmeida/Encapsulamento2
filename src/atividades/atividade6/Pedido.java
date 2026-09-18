package atividades.atividade6;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private double valorTotal;
    private String status;

    public Pedido(int numeroPedido, String cliente, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        setValorTotal(valorTotal);
        this.status = "Recebido";
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal > 0) {
            this.valorTotal = valorTotal;
        } else {
            System.out.println("Erro: O valor total deve ser maior que zero.");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("Recebido") ||
                status.equalsIgnoreCase("Preparando") ||
                status.equalsIgnoreCase("Pronto") ||
                status.equalsIgnoreCase("Entregue") ||
                status.equalsIgnoreCase("Cancelado")) {
            this.status = status;
        } else {
            System.out.println("Erro: Status inválido. Permitidos: Recebido, Preparando, Pronto, Entregue.");
        }
    }

    // Métodos de Negócio
    public void avancarStatus() {
        switch (this.status) {
            case "Recebido":
                this.status = "Preparando";
                System.out.println("Pedido #" + numeroPedido + " agora está Preparando.");
                break;
            case "Preparando":
                this.status = "Pronto";
                System.out.println("Pedido #" + numeroPedido + " agora está Pronto.");
                break;
            case "Pronto":
                this.status = "Entregue";
                System.out.println("Pedido #" + numeroPedido + " foi Entregue.");
                break;
            default:
                System.out.println("Não é possível avançar: pedido já finalizado ou cancelado (" + this.status + ").");
        }
    }

    public void cancelarPedido() {
        if (!this.status.equals("Entregue")) {
            this.status = "Cancelado";
            System.out.println("Pedido #" + numeroPedido + " cancelado com sucesso.");
        } else {
            System.out.println("Erro: Não é possível cancelar um pedido já entregue.");
        }
    }
}
