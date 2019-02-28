package UMLs;

public class contaTeste {

	public static void main(String[] args) {
		ContaBancaria p1;
		p1 = new ContaBancaria();
		
		p1.setCpf("QWOE0-QW9E0-21301293");
		p1.setRg("2193021D");
		p1.setPrimeiroNome("Lucas");
		p1.setSegundoNome("Fernandes");
		p1.setTemConta(false);
		p1.createAccount("Corrente");
		
		p1.showAccount();

	}

}
