package parteDois;

/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os 
experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.


Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, 
ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em 
cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste 
contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e
 um caractere Tipo ('C', 'R' ou 'S'),
indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual 
de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser 
apresentado com dois dígitos após o ponto.*/

import java.util.Locale;

import java.util.Scanner;

public class Beecrowd1094 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// indica os varios casos de teste que vem a seguir
		int n = sc.nextInt();

		int quantia; // quantidade de cobaias

		int qtdRatos = 0, qtdCoelhos = 0, qtdSapos = 0, qtdTotal = 0;
		char tipoCobaia;
		for (int i = 0; i < n; i++) {
			quantia = sc.nextInt();
			tipoCobaia = sc.next().charAt(0);

			switch (tipoCobaia) {
			case 'c':
				qtdCoelhos += quantia;
				break;
			case 'r':
				qtdRatos += quantia;
				break;
			case 's':
				qtdSapos += quantia;
				break;
			}
			qtdTotal += quantia;

		}

		System.out.println("Total: " + qtdTotal + "cobaias");
		System.out.println("Total de coelhos: " + qtdCoelhos);
		System.out.println("Total de ratos: " + qtdRatos);
		System.out.println("Total de sapos: " + qtdSapos);

		System.out.println("Percentual de coelhos: " + String.format("%.2f", ((double) qtdCoelhos / qtdTotal) * 100) + "%");
		System.out.println("Percentual de ratos: " + String.format("%.2f", ((double) qtdRatos / qtdTotal) * 100) + "%");
		System.out.println("Percentual de sapos: " + String.format("%.2f", ((double) qtdSapos / qtdTotal) * 100) + "%");

		sc.close();
	}

}
