import java.util.Scanner;

/*Refaça o mesmo problema.
Teste se a nota está entre 0.0 e 10.0.
Depois se foi reprovado direto, se sim, termina o programa. 
Se não, vai pra outro if pra saber se está de recuperação. Se estiver, termina.
Se não estiver de recuperação, vai pro else que diz que ele passou direto.*/

public class TesteReprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua nota entre [0.0] e [10.0]");
		nota = ler.nextFloat();
		
		if((nota <=10.0) && (nota >=0.0)) {
		System.out.println("ok, nota válida");	
		
		
		if(nota < 5) {
			System.out.println("reprovado");
		} else {
			if(nota >= 5) {
				System.out.println("Você está de recuperação");
			}else {
				System.out.println("Voce está aprovadooo!");
			}
		}
		}else {
			System.out.println("Nota inválida");
		}
		
		}
		
	}


