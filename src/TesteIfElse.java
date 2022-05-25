import java.util.Scanner;

/*As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma	
dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um	
programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o	
valor	total	da	compra.*/


public class TesteIfElse {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);// TODO Auto-generated method stub
		
		int QuantidadeMaçãs;
		double compra;
		
		System.out.println("Quantas maçãs você deseja comprar? ");
		QuantidadeMaçãs = ler.nextInt();
		
		if(QuantidadeMaçãs >=12) {
			compra = QuantidadeMaçãs * 0.25;
	} else {
		compra = QuantidadeMaçãs * 0.30;
	}
		System.out.println("O valor total da sua compra é: " + compra);
	}
}
