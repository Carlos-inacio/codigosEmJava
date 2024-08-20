package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosFuncionario;

public class ProgramFuncionario {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DadosFuncionario dados = new DadosFuncionario();
		
		System.out.print("Nome: ");
		dados.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		dados.salarioB = sc.nextDouble();
		System.out.print("Imposto: ");
		dados.imposto = sc.nextDouble();
		
		System.out.println("Employee: " + dados);
		System.out.print("Quanto em porcentagem que aumentar no salário?");
		double aumento = sc.nextDouble();
		dados.increaseSalary(aumento);
		
	
		System.out.println("Update data: " + dados);
		//System.out.println("Update data: " + dados.nome +  dados.newSalary());
		
		
		
		sc.close();
	}

}
