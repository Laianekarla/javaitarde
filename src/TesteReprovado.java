import java.util.Scanner;

/*Refa�a o mesmo problema.
Teste se a nota est� entre 0.0 e 10.0.
Depois se foi reprovado direto, se sim, termina o programa. 
Se n�o, vai pra outro if pra saber se est� de recupera��o. Se estiver, termina.
Se n�o estiver de recupera��o, vai pro else que diz que ele passou direto.*/

public class TesteReprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua nota entre [0.0] e [10.0]");
		nota = ler.nextFloat();
		
		if((nota <=10.0) && (nota >=0.0)) {
		System.out.println("ok, nota v�lida");	
		
		
		if(nota < 5) {
			System.out.println("reprovado");
		} else {
			if(nota >= 5) {
				System.out.println("Voc� est� de recupera��o");
			}else {
				System.out.println("Voce est� aprovadooo!");
			}
		}
		}else {
			System.out.println("Nota inv�lida");
		}
		
		}
		
	}


