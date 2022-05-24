import java.util.Locale;
import java.util.Scanner;

public class ExerciciosQuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int  valorPorHora = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		
		double salario;

		salario = valorPorHora * horasTrabalhadas;

		System.out.println("NUMBER = " + numero);
		System.out.printf("Salario = %.2f%n ", salario);

		sc.close();
	}

}
