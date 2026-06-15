package org.example;

public class Main2 {

    public static void main(String[] args) {

        FestaAniversario festa = new FestaAniversario();

        festa.setTema("Festa Junina");
        festa.setLocal("Salão de Festas");
        festa.setConvidados(50);
        festa.setAniversariante("Maria");
        festa.setValor(3000);

        System.out.println("Tema: " + festa.getTema());
        System.out.println("Local: " + festa.getLocal());
        System.out.println("Convidados: " + festa.getConvidados());
        System.out.println("Aniversariante: " + festa.getAniversariante());
        System.out.println("Valor: R$ " + festa.getValor());
    }
}