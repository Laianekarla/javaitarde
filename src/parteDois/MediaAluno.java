/*	� Escreva um algoritmo que leia o c�digo de um aluno e suas tr�s notas. 
 * Calcule a m�dia ponderada do aluno, considerando que o peso para a maior 
 * nota seja 4 e para as duas restantes, 3. Mostre o c�digo do aluno, suas tr�s notas, 
 * a m�dia calculada e uma mensagem "APROVADO" se a m�dia for maior ou igual a 5 e "REPROVADO"
 *  se a m�dia for menor que 5. Repita a opera��o at� que o c�digo lido seja negativo.
 */

package parteDois;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Digite seu c�digo, e suas 3 notas");
		int codigo = sc.nextInt();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double mediaPonderada = 0;

		if (nota1 > nota2 && nota1 > nota3) {
			mediaPonderada = ((nota1 * 4) + (nota2 * 3) + (nota3 * 3)) / 10;
		} else if (nota2 >  nota3) {
			mediaPonderada = ((nota2 * 4) + (nota1 * 3) + (nota3 * 3)) / 10;
		} else {
			mediaPonderada = ((nota3 * 4) + (nota1 * 3) + (nota2 * 3)) / 10;
		}

		while (mediaPonderada >= 5.00) {
			System.out.printf("Aprovado!%n Codigo %d%n Notas: %.2f %.2f %.2f%n Media Ponderada: %.2f%n", codigo, nota1,
					nota2, nota3, mediaPonderada);
			
			mediaPonderada = sc.nextDouble();
		}

		System.out.printf("Reprovado!%n Codigo %d%n Notas: %.2f %.2f %.2f%n Media Ponderada: %.2f%n", codigo, nota1,
				nota2, nota3, mediaPonderada);

	}
}
