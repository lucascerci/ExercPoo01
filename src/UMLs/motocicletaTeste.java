package UMLs;

public class motocicletaTeste {

	public static void main(String[] args) {
		MotocicletaYamaha m;
		m = new MotocicletaYamaha();
		m.setType("Kawazaki");
		m.setMarca("Yamaha");
		
		if(m.getMarca() == "Yamaha") {
			m.setDisponivelParaVenda(true);
		}
		
		m.apresentarMotocicleta();	
	}

}
