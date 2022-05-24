import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int numeroPeças = sc.nextInt();
		double valorUnitario = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int numeroPeças2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double total;
		
		total = valorUnitario * numeroPeças + valorUnitario2 * numeroPeças2;
		
		System.out.printf("VALOR A PAGAR: %.2f%n", total);
		
		
		
		sc.close();
		
		
		
	}

}
