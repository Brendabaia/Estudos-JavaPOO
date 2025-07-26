package com.jovemprogramador.cursojavatarde.oop;

public class CartaoCredito implements MetodoPagamento {
    public void pagar(double valor) {
    	
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
    }
    

    public void cancelarPagamento() {
    	
        System.out.println("Pagamento cancelado: Cartão de Crédito");
        
    }
    
}
