package UMLs;

import java.util.Scanner;

public class FahrenheiteToCelsius {

	public static void main(String[] args) {
		 float temperature;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Coloque a temperatura em Fahrenheit");
		    temperature = in.nextInt();
		 
		    System.out.println("Temperatura em celsius = " + conversao(temperature));

	}
	
	public static float conversao(Float temperature) {
		float convertido = ((temperature - 32)*5)/9;
		return convertido;
	}
}
