package org.example;

public class TelefoneCelular {

    String marca;
    String modelo;
    String cor;
    int memoria;
    double preco;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}