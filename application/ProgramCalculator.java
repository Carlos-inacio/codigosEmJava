package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCalculator {
	
	//Constante PI
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circunferencia(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circunferencia: %.2f\n", c);
		System.out.printf("Volume: %.2f\\n", v);
		System.out.printf("Valor de PI: %.2f\\n", PI);
		
		sc.close();
	}
	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}


}
