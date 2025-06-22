package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.carga = 90;
		c1.cor = "Azul";
		c1.modelo = "Bic";
		c1.ponta = 3.0;
		
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.carga = 90;
		c2.cor = "Azul";
		c2.modelo = "Bic";
		c2.ponta = 3.02;
		
		c2.destampar();
		c2.status();
		c2.rabiscar();

	}

}
