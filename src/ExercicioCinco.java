import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int numeroPe�as = sc.nextInt();
		double valorUnitario = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int numeroPe�as2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double total;
		
		total = valorUnitario * numeroPe�as + valorUnitario2 * numeroPe�as2;
		
		System.out.printf("VALOR A PAGAR: %.2f%n", total);
		
		
		
		sc.close();
		
		
		
	}

}
