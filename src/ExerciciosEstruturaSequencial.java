import java.util.Locale;
import java.util.Scanner;

public class ExerciciosEstruturaSequencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 Locale.setDefault(Locale.US);
		 
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 int soma = num1 + num2;
		 System.out.println("A soma dos números é : " + soma);
		 
		 sc.close();
	}

}
