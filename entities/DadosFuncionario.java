package entities;

public class DadosFuncionario {
	
	public String nome;
	public double salarioB;
	public double imposto;
	
	
	public double netSalary() {
		return salarioB - imposto;
	}
	
	public void increaseSalary(double porc) {
		
		salarioB += salarioB * (porc / 100);
	}
	
	
	
	public String toString() {
		return nome + ", $ "  + String.format("%.2f", netSalary());
	}
	
	
}
	
	

