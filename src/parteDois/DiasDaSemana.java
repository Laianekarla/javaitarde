/*Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado o número 
referente ao dia. Considere que domingo é o dia 1 e sábado é o dia 7. Utilize a estrutura Switch.*/

package parteDois;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo(fim de semana)";
			break;
		case 2:
			dia = "Segunda(dia útil)";
			break;
		case 3:
			dia = "Terça-feira(dia útil)";
			break;
		case 4:
			dia = "Quarta-feira(dia útil)";
			break;
		case 5:
			dia = "Quinta-feira(dia útil)";
			break;
		case 6:
			dia = "Sexta-feira(dia útil)";
			break;
		case 7:
			dia = "Sábado(dia útil)";
			break;
		default:
			dia = "dia inválido";
			break;

		}
		System.out.println(dia);

		sc.close();

	}

}
