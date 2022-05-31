/*Criar um programa para identificar o valor a ser pago por um plano de saúde dada a 
 * idade do conveniado considerando que todos pagam R$ 100 mais um adicional conforme
 *  a seguinte tabela: 1) crianças com menos de 10 anos pagam R$80; 2) conveniados com
 *   idade entre 10 e 30 anos pagam R$50; 3) conveniados com idade acima de 30 e até 60
 *    anos pagam R$ 95; e 4) conveniados acima de 60 anos pagam R$130*/

package parteDois;

import java.util.Locale;
import java.util.Scanner;

public class CalculoPlanoDeSaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		double adicional;

		if (idade < 10) {
			adicional = 100.0 + 80.0;
			System.out.println("O valor total é de R$ " + adicional);
		} else if (idade <= 30) {
			adicional = 100.0 + 50.0;
			System.out.println("O valor total é de R$ " + adicional);
		} else if ( idade <= 60) {
			adicional = 100.0 + 95.0;
			System.out.println("O valor total é de R$ " + adicional);
		} else {
			adicional = 100.0 + 130.0;
			System.out.println("O valor total é de R$ " + adicional);
		}

		sc.close();

	}

}
