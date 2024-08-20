package entities;
/*Uma Classe pode ter atributos e m�todos .
 * 
 * public quer dizer que os atributos abaixo podem ser acessados por outro
 * arquivo.
 */
public class Triangle {
	//Atributos da classe	a, b, c
	
	public double a;
	public double b;
	public double c;
	
	//M�todo para calcular a �rea do tri�ngulo
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
