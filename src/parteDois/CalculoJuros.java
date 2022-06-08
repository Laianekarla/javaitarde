package parteDois;

import java.util.Locale;
import java.util.Scanner;

public class CalculoJuros {

	/*
	 * ) Elabore duas funções que recebem três parâmetros: capital inicial, taxa de
	 * juros e tempo de aplicação. A primeira função retornará o montante da
	 * aplicação financeira sob o regime de juros simples e a segunda retornará o
	 * valor da aplicação sob o regime de juros compostos.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double capitalInicial = sc.nextDouble();
		double taxaDeJuros = sc.nextDouble();
		int tempoDeAplicacao = sc.nextInt();

		double montante = max(capitalInicial, taxaDeJuros, tempoDeAplicacao);

		showResult(montante);
		sc.close();

	}

	public static double max(double capitalInicial, double taxaDeJuros, int tempoDeAplicacao) {

		double montante = capitalInicial * taxaDeJuros;
		return montante;

	}
	
	public static void showResult(double value) {
		System.out.println("Montante = " + value);
	}
	
	//m = c * (1 - i) * t
	
	/*public static double calculo(double capitalInicial, double taxaDeJuros, int tempoDeAplicacao) {
		
	
		double montante = capitalInicial * (1 - taxaDeJuros ) * tempoDeAplicacao;
		return montante;
		
	}
	
	public static void mostrarCalculo(double value) {
		System.out.println("Montante = " + value);
	}*/
	

}