package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno notas = new Aluno();
		System.out.print("Insira o nome do aluno: ");
		notas.nome = sc.nextLine();
		System.out.print("Primeira nota: ");
		notas.N1 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		notas.N2 = sc.nextDouble();
		System.out.print("Terceita nota: ");
		notas.N3 = sc.nextDouble();
		
		System.out.println(notas.media());
		
		sc.close();
	}

}
