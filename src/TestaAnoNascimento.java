import java.util.Scanner;

/* . Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 nascimento	 de	 uma	 pessoa	 e	
escrever	 uma	 mensagem	 que	 diga	 se	 ela	 poder�	 ou	 n�o	 votar	 este	 ano	
(n�o	�	necess�rio	considerar	o	m�s	em	que	ela	nasceu).
 */
public class TestaAnoNascimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int AnoNascimento;
		
		System.out.println("Digite o ano do seu nascimento: ");
		AnoNascimento = ler.nextInt();
		
		if(AnoNascimento <= 2006) {
			System.out.println("Voc� poder� votar esse ano! ");
		} else {
			System.out.println("Voc� ainda n�o pode votar! ");
		}
		
	}

}
