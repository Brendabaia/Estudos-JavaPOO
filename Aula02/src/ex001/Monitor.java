package ex001;

public class Monitor { 
	String modelo;
	String cor;
	double tamnho;
	Boolean ligado;
	
    void status() {
    	if(this.ligado == true) {
    		 System.out.println("Ligou");
    	}else {
    		 System.out.println("sem img");
    	}
		
	}
	void ligar() {
		this.ligado = true;
	}
    void desligar() {
    	this.ligado = false;
	}
    
}
