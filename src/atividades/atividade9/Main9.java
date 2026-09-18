package atividades.atividade9;

public class Main9 {
    public static void main(String[] args) {
        System.out.println("--- 9 Teste de Evento ---");
        Evento evento = new Evento("Workshop HTML/CSS SENAI", 50, 25.0);
        evento.venderIngresso(45);
        evento.mostrarVagasDisponiveis();
        evento.venderIngresso(10);    // Deve barrar (passa de 50)
        evento.cancelarIngresso(5);
        evento.mostrarVagasDisponiveis();
        System.out.println();
    }
}
