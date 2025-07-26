package com.jovemprogramador.cursojavatarde.oop;

public class Pix implements MetodoPagamento {
    public void pagar(double valor) {
    	
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }

    public void cancelarPagamento() {
    	
        System.out.println("Pagamento cancelado: PIX");
    }
}
