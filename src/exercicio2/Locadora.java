package exercicio2;

import java.util.Date;

import exercicio2.Cliente.TipoCliente;
import exercicio2.Cliente.TipoDocumento;

public class Locadora {
	public enum TipoAlugueis{POPULAR, SUVS, UTILITARIOS};
	private TipoAlugueis tipo;
	private boolean isAlugado;
	private Cliente cliente;
	private Carro carro;
	private int diasAlugado;
	private boolean tanqueIsCheio;
	
	public void registraCliente(String nome, TipoCliente tipo, TipoDocumento docType, String document, Date DataAlugou) {
		Cliente c;
		c = new Cliente();
		c.setName(nome);
		c.setType(tipo);
		c.setTypeDoc(docType);
		c.setDocument(document);
		
		this.setCliente(c);
	}
	
	public String alugaCarro(int dias, double carroDiaria) {
		if(!this.isAlugado) {
			this.isAlugado = true;
			return "Boa escolha de carro " + this.cliente.getName() + ", seu carro foi alugado com sucesso por " + dias + 
					" pelo preço de " + calculaLocacao(dias, carroDiaria) + "R$!!!!!";
		}
		return "Você já aluga um carro, e os clientes só podem alugar um carro por vez";
	}
	
	public double calculaLocacao(int dias, double diariaAutomovel){
		return dias * diariaAutomovel;
	}
	

	public TipoAlugueis getTipo() {
		return tipo;
	}

	public void setTipo(TipoAlugueis tipo) {
		this.tipo = tipo;
	}

	public boolean isAlugado() {
		return isAlugado;
	}

	public void setAlugado(boolean isAlugado) {
		this.isAlugado = isAlugado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getDiasAlugado() {
		return diasAlugado;
	}

	public void setDiasAlugado(int diasAlugado) {
		this.diasAlugado = diasAlugado;
	}

	public boolean isTanqueIsCheio() {
		return tanqueIsCheio;
	}

	public void setTanqueIsCheio(boolean tanqueIsCheio) {
		this.tanqueIsCheio = tanqueIsCheio;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	
	
}
