package exercicio2;

public class Carro {
	private String nome;
	private String marca;
	private String cor;
	private double precoPorDia;
	private boolean tanqueIsCheio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPrecoPorDia() {
		return precoPorDia;
	}
	public void setPrecoPorDia(double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}
	public boolean isTanqueIsCheio() {
		return tanqueIsCheio;
	}
	public void setTanqueIsCheio(boolean tanqueIsCheio) {
		this.tanqueIsCheio = tanqueIsCheio;
	}
	
}
