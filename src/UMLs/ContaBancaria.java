package UMLs;

public class ContaBancaria {
	private String cpf;
	private String rg;
	private String nome;
	private String tipo;
	private boolean temConta;
	
	public ContaBancaria() {
		//constructor
	}
	
	public void createAccount() {
		if(!this.temConta){
			//Deseja criar uma conta?
			//IF responsta === true -> Metodo de criar conta else responder Então tchau
		}else {
			//Return showMessage falando(Voce ja tem uma conta);
		}
	}
	
	public void deleteAccount() {
		if(this.temConta){
			//Porque deseja deletar a conta?
			//PQ SIM
			//BLZ RETURN this.temConta == false;
		}else {
			//Voce ainda nao tem uma conta return -> createAccount
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		
}
