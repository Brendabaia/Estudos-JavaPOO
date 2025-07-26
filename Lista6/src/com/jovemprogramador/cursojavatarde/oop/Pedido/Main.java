package com.jovemprogramador.cursojavatarde.oop.Pedido;

public class Main {
    public static void main(String[] args) {
        Pedido pizza = new PedidoPizza("Pizza Calabresa", 45.0);
        Pedido hamburguer = new PedidoHamburgue("Hambúrguer Bacon", 25.0);
        Pedido bebida = new PedidoBebida("Refrigerante", 8.0);

        pizza.preparar();
        ((PedidoBase) pizza).exibirStatus();
        pizza.entregar();

        System.out.println();

        hamburguer.preparar();
        ((PedidoBase) hamburguer).exibirStatus();
        hamburguer.entregar();

        System.out.println();

        bebida.preparar();
        ((PedidoBase) bebida).exibirStatus();
        bebida.entregar();
    }
}
