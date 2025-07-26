package ex002;

public class Conta {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	//Método Especiais
	public Conta(int numConta, String tipo, String dono, float saldo, boolean status) {
		super();
		//this.numConta = numConta;
		//this.tipo = tipo;
		//this.dono = dono;
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	//Métodos Personalizados

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta");
	}
	
    public void fecharConta(String tipo) {
    	
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro, nao pode ser fechada");
		} else if (this.getSaldo() < 0) {
			System.out.println("nao pode ser fechada");
		} else {
			this.setStatus(false);
			System.out.println("Encerramento de conta");
		}
	}
    public void depositar(float v) {
    	if(status =  true) {
			setSaldo(getSaldo() + v);
		}  else {
			System.out.println("Erro");
		}
	}
    
	public void sacar(float v) {
		if(status =  true) {
			
		} if ( saldo > v) {
			setSaldo(getSaldo() - v);
		} else {
			System.out.println("Erro");
		}
			
		
	}
	
	
	}


