import java.util.Locale;
import java.util.Scanner;

public class ExerciciosTresIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o multiplos");
		}
		else {
			System.out.println("N�o sao multiplos");
		}
		
		
		sc.close();
	}

}
