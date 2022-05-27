/*Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar
Algoritmos!”. */


package parteDois;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciosComandosRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <= 20; i++) {
			System.out.println(i + " Eu gosto de estudar algoritmos");
		}
		
		
		
		
		sc.close();
		
		
	}

}
