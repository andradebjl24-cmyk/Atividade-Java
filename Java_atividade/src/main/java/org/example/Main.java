package org.example;

public class Main {

    public static void main(String[] args) {

        TelefoneCelular celular = new TelefoneCelular();

        celular.setMarca("Samsung");
        celular.setModelo("A55");
        celular.setCor("Azul");
        celular.setMemoria(256);
        celular.setPreco(2500);

        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Memória: " + celular.getMemoria() + " GB");
        System.out.println("Preço: R$ " + celular.getPreco());
    }
}