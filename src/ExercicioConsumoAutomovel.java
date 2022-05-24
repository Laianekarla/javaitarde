import java.util.Locale;
import java.util.Scanner;

public class ExercicioConsumoAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		double consumo = x / y;
		System.out.printf(" o consumo médio é de: %.3f km/1", consumo );
		
		
		
		
		
		
		
		sc.close();
	}

}
