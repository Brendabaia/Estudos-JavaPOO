package aula04;

public class Caneta {
	public String modelo;
	private float ponta;
	
	public void Caneta() { // Método Contrutor
		
	}
	
	public String getModelo() { //Método Getters
		return this.modelo;
	}
	
	public void setModelo(String m) { //Método Setters
		 this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		 this.ponta = p;
	}
	public void status() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
	}
	

}
