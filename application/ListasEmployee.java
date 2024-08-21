package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ListasEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Criando lista do tipo classe
		List<Employee> list = new ArrayList<>();
		
		//inserindo a quantidade de empregados a serem registrado
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		//inserindo dados dos empregados
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Emplyee #" + (i+1) + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			//inserinto emp na lista
			list.add(emp);
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt(); //digitando o numero do id
		Integer pos = position(list, idsalary);		//chamando a posição position() e pos recebendo  
		if (pos == null) {
			System.out.println("This id does not exist!\n");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for(Employee emp : list) {
			System.out.println(emp);
		}
		
		
		
		sc.close();
		
	}
	
	//Funcao para encontrar um elemento na lista pela posição
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}	

}
