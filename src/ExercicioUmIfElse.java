import java.util.Locale;
import java.util.Scanner;

public class ExercicioUmIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if(num1 < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("Nao negativo");
		}
		
		
		sc.close();
	}

}
