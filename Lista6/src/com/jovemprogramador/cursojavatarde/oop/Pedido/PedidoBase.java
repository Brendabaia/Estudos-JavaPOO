package com.jovemprogramador.cursojavatarde.oop.Pedido;

public abstract class PedidoBase implements Pedido {
    protected String nomeItem;
    protected double preco;
    protected String status;

    public PedidoBase(String nomeItem, double preco) {
        this.nomeItem = nomeItem;
        this.preco = preco;
        this.status = "Recebido";
    }

    @Override
    public void preparar() {
        status = "Em preparação";
        System.out.println(nomeItem + " está sendo preparado.");
    }

    @Override
    public void entregar() {
        status = "Entregue";
        System.out.println(nomeItem + " foi entregue. Preço: R$ " + preco);
    }

    public void exibirStatus() {
        System.out.println("Status do pedido de " + nomeItem + ": " + status);
    }
}
