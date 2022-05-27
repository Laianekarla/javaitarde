//Escreva um algoritmo que calcule a soma dos números de 1 a 15

package parteDois;

import java.util.Scanner;

public class ExercicioCalculoSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		int soma = 0;
		
		for( int i=1; i<=15; i++) {
			soma = soma + i;
			System.out.println(soma);
		}
		
		
		
	sc.close();
}

}
