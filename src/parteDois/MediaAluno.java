/*	� Escreva um algoritmo que leia o c�digo de um aluno e suas tr�s notas. 
 * Calcule a m�dia ponderada do aluno, considerando que o peso para a maior 
 * nota seja 4 e para as duas restantes, 3. Mostre o c�digo do aluno, suas tr�s notas, 
 * a m�dia calculada e uma mensagem "APROVADO" se a m�dia for maior ou igual a 5 e "REPROVADO"
 *  se a m�dia for menor que 5. Repita a opera��o at� que o c�digo lido seja negativo.
 */

package parteDois;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu c�digo, e suas 3 notas");
		int codigo = sc.nextInt();
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		int mediaPonderada;
		

		mediaPonderada = (4 * nota1) + (3 * nota2) + (3 * nota3) / 10; // calculo media ponderada
		

		while (mediaPonderada > 0) {
			int media = mediaPonderada;
			if (media >= 5) {
				System.out.printf("APROVADO!! C�digo %d, Notas: %d, %d, %d e a m�dia calculada %d%n", codigo, nota1,
						nota2, nota3, mediaPonderada);

			} else {
				System.out.printf("Reprovado!! C�digo %d, Notas: %d, %d, %d e a m�dia calculada %d%n", codigo, nota1,
						nota2, nota3, mediaPonderada);

			}

			mediaPonderada = sc.nextInt();
		}

		sc.close();
	}

}
