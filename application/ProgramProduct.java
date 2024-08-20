package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class ProgramProduct {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product produto = new Product(); // Instanciando a classe Product

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.name = sc.nextLine();
		System.out.print("Price: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantity: ");
		produto.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + produto);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + produto);

		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + produto);

		sc.close();

	}

}
