import java.util.Scanner;

//pedir 3 numeros inteiros e retornar qual o menor entre eles

public class ExercicioMenorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a < b && a < c) {
			System.out.println("MENOR = " + a);
		}
		else if (b < c) {
			System.out.println("MENOR = " + b);
		}
		else {
			System.out.println("MENOR = " + c);
		}
		
		sc.close();
		
		
	}

}
