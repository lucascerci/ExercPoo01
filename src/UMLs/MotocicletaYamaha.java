package UMLs;

import javax.swing.JOptionPane;

public class MotocicletaYamaha {
	private String type;
	private String marcaQueTrabalhamos = "Yamaha";
	private String marca;
	private boolean disponivelParaVenda;
	
	public MotocicletaYamaha() {
		
	}
	
	public void apresentarMotocicleta() {
		System.out.println("A moto: " + this.getType() + "\nDa marca: " +this.getMarca());
		if(this.isDisponivelParaVenda() && this.getMarca() == this.getMarcaQueTrabalhamos()) {
			System.out.println("Temos em estoque. E o preço é de R$XX.XXXX");
		}else{
			System.out.println("Ops, infelizmente só trabalhamos com a marca " +this.getMarcaQueTrabalhamos()+ " no momento.");
		}
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public boolean isDisponivelParaVenda() {
		return disponivelParaVenda;
	}


	public void setDisponivelParaVenda(boolean disponivelParaVenda) {
		this.disponivelParaVenda = disponivelParaVenda;
	}

	public String getMarcaQueTrabalhamos() {
		return marcaQueTrabalhamos;
	}

	public void setMarcaQueTrabalhamos(String marcaQueTrabalhamos) {
		this.marcaQueTrabalhamos = marcaQueTrabalhamos;
	}


	
	
}
