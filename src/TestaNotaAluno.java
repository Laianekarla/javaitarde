import java.util.Scanner;

/*Desafio 1: Crie um programa que recebe uma nota ( pela classe Scanner) e checa se voc� passou direto, 
 * ficou de recupera��o ou foi reprovado na mat�ria.
A regra � a seguinte:
Nota 7 ou mais: passou direto
Entre 5 e 7: tem direito de fazer uma prova de recupera��o
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
				System.out.println("Parab�ns! Voc� foi aprovado.");
			} else {
				if (nota >= 5.0) {
					System.out.println("Vai ter que fazer recupera��o. ");
				} else {
					System.out.println("Voc� foi reprovado! ");
				}
			}
		} else {
			System.out.println("Nota inv�lida, fechando aplicativo.");
		}

		/*
		 * if (nota >= 7) { System.out.println("Voc� foi aprovado"); } else if (nota >=
		 * 5 && nota == 7) { System.out.println("Voc� est� de recupera��o! "); } if
		 * (nota < 5) { System.out.println("Voc� est� reprovado! "); }
		 */

	}
}
