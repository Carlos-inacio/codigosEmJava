package entities;

public class Aluno {
	
	public double N1, N2, N3;
	public String nome;
	
	
	public double media() {
		return (N1 + N2 + N3) / 3;
	}

}
