import java.util.Scanner;

/*As	ma��s	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma	
d�zia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um	
programa	 que	 leia	 o	 n�mero	 de	 ma��s	 compradas,	 calcule	 e	 escreva	 o	
valor	total	da	compra.*/


public class TesteIfElse {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);// TODO Auto-generated method stub
		
		int QuantidadeMa��s;
		double compra;
		
		System.out.println("Quantas ma��s voc� deseja comprar? ");
		QuantidadeMa��s = ler.nextInt();
		
		if(QuantidadeMa��s >=12) {
			compra = QuantidadeMa��s * 0.25;
	} else {
		compra = QuantidadeMa��s * 0.30;
	}
		System.out.println("O valor total da sua compra �: " + compra);
	}
}
