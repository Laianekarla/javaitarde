import java.util.Scanner;

/*Desafio 1: Crie um programa que recebe uma nota ( pela classe Scanner) e checa se você passou direto, 
 * ficou de recuperação ou foi reprovado na matéria.
A regra é a seguinte:
Nota 7 ou mais: passou direto
Entre 5 e 7: tem direito de fazer uma prova de recuperação
Abaixo de 5: reprovado direto*/

public class TestaNotaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		// double nota;
		float nota;

		System.out.println("Digite sua nota[0.0 - 10.0] ");
		nota = ler.nextFloat();

		if ((nota <= 10.0) && (nota >= 0.0)) {

			if (nota >= 7.0) {
				System.out.println("Parabéns! Você foi aprovado.");
			} else {
				if (nota >= 5.0) {
					System.out.println("Vai ter que fazer recuperação. ");
				} else {
					System.out.println("Você foi reprovado! ");
				}
			}
		} else {
			System.out.println("Nota inválida, fechando aplicativo.");
		}

		/*
		 * if (nota >= 7) { System.out.println("Você foi aprovado"); } else if (nota >=
		 * 5 && nota == 7) { System.out.println("Você está de recuperação! "); } if
		 * (nota < 5) { System.out.println("Você está reprovado! "); }
		 */

	}
}
