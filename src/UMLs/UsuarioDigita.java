package UMLs;

import java.util.Scanner;

public class UsuarioDigita {

	public static void main(String[] args) {
		   	Scanner in = new Scanner(System.in);
			
		   	String nome = "Lucas";  //alterar o nome aqui
		   	double salario;
		   	double porcentagem = 10;
		   	

		    System.out.println("Salario bruto: ");
		    salario = in.nextFloat();
		    
		    
		    
		    System.out.println("Salario do funcionario " + nome + " é de:" + somaSal(salario, porcentagem));

	}
	
	public static double somaSal(double salario, double porcentagem) {
		
		double salarioPorc = (salario*porcentagem)/100;
		
		double resultado = salarioPorc + salario;

		return resultado;
	}

}
