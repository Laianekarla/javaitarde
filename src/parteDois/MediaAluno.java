/*	• Escreva um algoritmo que leia o código de um aluno e suas três notas. 
 * Calcule a média ponderada do aluno, considerando que o peso para a maior 
 * nota seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas três notas, 
 * a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 5 e "REPROVADO"
 *  se a média for menor que 5. Repita a operação até que o código lido seja negativo.
 */

package parteDois;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu código, e suas 3 notas");
		int codigo = sc.nextInt();
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		int mediaPonderada;
		

		mediaPonderada = (4 * nota1) + (3 * nota2) + (3 * nota3) / 10; // calculo media ponderada
		

		while (mediaPonderada > 0) {
			int media = mediaPonderada;
			if (media >= 5) {
				System.out.printf("APROVADO!! Código %d, Notas: %d, %d, %d e a média calculada %d%n", codigo, nota1,
						nota2, nota3, mediaPonderada);

			} else {
				System.out.printf("Reprovado!! Código %d, Notas: %d, %d, %d e a média calculada %d%n", codigo, nota1,
						nota2, nota3, mediaPonderada);

			}

			mediaPonderada = sc.nextInt();
		}

		sc.close();
	}

}
