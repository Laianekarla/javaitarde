/*Faça um programa que leia um número entre 0 e 10, e escreva este número por extenso. 
 * Use o comando switch. Crie um case default que escreva ‘Número fora do intervalo./*
 */

package parteDois;

import java.util.Scanner;

public class NumeroPorExtenso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String numero;

		switch (x) {
		case 0:
			numero = "Zero";
			break;
		case 1:
			numero = "Um";
			break;
		case 2:
			numero = "Dois";
			break;
		case 3:
			numero = "Três";
			break;
		case 4:
			numero = "Quatro";
			break;
		case 5:
			numero = "Cinco";
			break;
		case 6:
			numero = "Seis";
			break;
		case 7:
			numero = "Sete";
			break;
		case 8:
			numero = "Oito";
			break;
		case 9:
			numero = "Nove";
			break;
		case 10:
			numero = "Dez";
			break;
		default:
			numero = "fora de intervalo";
			break;

		}
		System.out.println("Número " + numero);
		sc.close();

	}

}
