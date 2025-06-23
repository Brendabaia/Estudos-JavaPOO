package aula04;

public class Caneta {
	public String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;
	
	
	public  Caneta() { // Método Contrutor
		this.tampar();
		this.cor = "Azul";
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
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	public void status() {
		System.out.println("SOBRE A CANETA:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada: " + this.tampada);
	}
	

}
