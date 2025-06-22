package aula02;

public class Caneta {
	String modelo;
	String cor;
	double ponta;
	int carga;
	Boolean tampada;
	
	void status() {
		System.out.println("Modelo:" + this.modelo );
		System.out.println("Ponta:" + this.ponta);
		System.out.println("Carga:" + this.carga);
		System.out.println("Uma caneta" + this.cor );
		System.out.println("Esta tampada? " + this.tampada );
	}
	
     void rabiscar() {
    	 if (this.tampada == true) {
    		 System.out.println("ERRO! Não esta destampda");
    	 } else {
    		 System.out.println("Eu estou rarbicando");
    	 }
		
	}
     
     void tampar() {
 		this.tampada = true;
 	}
     void destampar() {
    	 this.tampada = false;
 	}
	
	

}
