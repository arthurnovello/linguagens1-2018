package com.example.murilo.minhalistadefimdeano;

import java.io.Serializable;

public class Pedido implements Serializable{
    private String nome;
    private double preco;
    private String plataforma;
    private boolean isHardware;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public boolean isHardware() {
        return isHardware;
    }

    public void setHardware(boolean hardware) {
        isHardware = hardware;
    }

    @Override
    public String toString() {
        if(isHardware)
            return "Nome:"+nome+ " Preço:"+preco;
        else
            return "Nome:" + nome+ " Plataforma:" + plataforma + " Preço:" + preco;
    }
}
