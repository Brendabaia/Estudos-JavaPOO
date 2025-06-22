package ex001;

public class Exercico01 {

	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		m1.cor = "preto";
		m1.modelo = "sansung";
		m1.tamnho = 27.3;
		m1.ligado= false;
		
		m1.status();
		m1.ligar();

	}

}
