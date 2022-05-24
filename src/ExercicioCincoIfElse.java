import java.util.Locale;
import java.util.Scanner;

public class ExercicioCincoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double valor = 0;
		
		if(codigo == 1) {
			valor = quantidade * 4.0;
		}
		else if (codigo == 2) {
			valor = quantidade * 4.5;
		}
		else if (codigo == 3) {
			valor = quantidade * 5.0;
		}
		else if (codigo == 4) {
			valor = quantidade * 2.0;
		}
		else if(codigo == 5) {
			valor = quantidade * 1.5;
		}
		else {
			System.out.println("Digite um código valido. ");
		}
		
		System.out.printf("TOTAL =  %.2f%n", valor);
		
		sc.close();
	}

}
