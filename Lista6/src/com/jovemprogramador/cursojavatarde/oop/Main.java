package com.jovemprogramador.cursojavatarde.oop;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito();
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();

        LojaVirtual loja = new LojaVirtual();

        loja.realizarPagamento(cartao, 150.0);
        loja.realizarPagamento(pix, 75.5);
        loja.realizarPagamento(boleto, 200.0);

        cartao.cancelarPagamento();
        pix.cancelarPagamento();
        boleto.cancelarPagamento();
    }
}
