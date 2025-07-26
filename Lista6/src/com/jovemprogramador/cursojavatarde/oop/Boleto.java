package com.jovemprogramador.cursojavatarde.oop;

public class Boleto implements MetodoPagamento {
    public void pagar(double valor) {
    	
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto.");
    }

    public void cancelarPagamento() {
    	
        System.out.println("Pagamento cancelado: Boleto");
    }
}