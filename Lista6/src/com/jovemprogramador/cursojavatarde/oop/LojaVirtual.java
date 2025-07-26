package com.jovemprogramador.cursojavatarde.oop;

public class LojaVirtual {
    public void realizarPagamento(MetodoPagamento metodo, double valor) {
        metodo.pagar(valor);
    }
}
