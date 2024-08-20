package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Retangulo {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Digite a largura do ret�ngulo: ");
		r.largura = sc.nextDouble();
		System.out.println("Digite a altura do ret�ngulo: ");
		r.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f\n",  r.area());
		System.out.printf("PERIMETRO = %.2f\n", r.perimetro());
		System.out.printf("DIAGONAL = %.2f\n", r.diagonal());
		
		sc.close();
	}

}
