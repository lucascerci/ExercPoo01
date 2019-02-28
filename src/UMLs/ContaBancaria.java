package UMLs;


public class ContaBancaria {
	private String primeiroNome;
	private String segundoNome;
	private String cpf;
	private String rg;
	private String tipo;
	private boolean temConta;
	
	public ContaBancaria() {
		//constructor
	}
	
	public void createAccount(String tipo) {
		if(!this.temConta){
			this.setTipo(tipo);
			this.setTemConta(true);
		}else {
	    	System.out.print("Você já possue uma conta");
		}
	}
	
	public void deleteAccount() {
		if(this.temConta){
	    		this.temConta = false;
		}else {
			System.out.print("Você ainda não tem uma conta");
		}
	}
	
	
	public void showAccount() {
		if(this.temConta) {
			System.out.print("Conta de " + this.getPrimeiroNome() + " " + this.getSegundoNome() +
			"\nCpf: " + this.getCpf() + "\nRg: " +this.getRg()+ "\nTipo de conta: " + this.getTipo());
		}else {
			System.out.print("Nao possue conta ainda.");
		}
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isTemConta() {
		return temConta;
	}
	public void setTemConta(boolean temConta) {
		this.temConta = temConta;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}	
		
}
