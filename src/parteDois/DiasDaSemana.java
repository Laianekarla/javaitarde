/*Crie um programa que exibe se um dia � dia �til, fim de semana ou dia inv�lido dado o n�mero 
referente ao dia. Considere que domingo � o dia 1 e s�bado � o dia 7. Utilize a estrutura Switch.*/

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
			dia = "Segunda(dia �til)";
			break;
		case 3:
			dia = "Ter�a-feira(dia �til)";
			break;
		case 4:
			dia = "Quarta-feira(dia �til)";
			break;
		case 5:
			dia = "Quinta-feira(dia �til)";
			break;
		case 6:
			dia = "Sexta-feira(dia �til)";
			break;
		case 7:
			dia = "S�bado(dia �til)";
			break;
		default:
			dia = "dia inv�lido";
			break;

		}
		System.out.println(dia);

		sc.close();

	}

}
