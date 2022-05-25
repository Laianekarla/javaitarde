import java.util.Scanner;

/*1. Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão	
informados	valores	iguais)	e	escrever	o	maior	deles.*/


public class TesteMaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int maiorNumero;
		
		System.out.println("Digite um número: ");
		numero1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = ler.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O maior número é o:  " + numero1);
		} else {
			System.out.println("O maior número é o: " + numero2);
		}
	}

}
