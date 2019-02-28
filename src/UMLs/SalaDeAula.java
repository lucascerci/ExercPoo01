package UMLs;

public class SalaDeAula extends Aluno {

	private boolean professorVeio;
	private String aula;
	private String tipoDeQuadro;
	private int quantidadeMesas;
	private int quantidadeCadeiras;
	
	
	
	public String getTipoDeQuadro() {
		return tipoDeQuadro;
	}
	public void setTipoDeQuadro(String tipoDeQuadro) {
		this.tipoDeQuadro = tipoDeQuadro;
	}
	public int getQuantidadeMesas() {
		return quantidadeMesas;
	}
	public void setQuantidadeMesas(int quantidadeMesas) {
		this.quantidadeMesas = quantidadeMesas;
	}
	public int getQuantidadeCadeiras() {
		return quantidadeCadeiras;
	}
	public void setQuantidadeCadeiras(int quantidadeCadeiras) {
		this.quantidadeCadeiras = quantidadeCadeiras;
	}
	public boolean isProfessorVeio() {
		return professorVeio;
	}
	public void setProfessorVeio(boolean professorVeio) {
		this.professorVeio = professorVeio;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	
}
