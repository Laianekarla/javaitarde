import java.util.Scanner;

/*Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida	
pelo	 usu�rio.	 A	 senha	 v�lida	 �	 o	 n�mero	 1234.	Devem	 ser	impressas	 as	
seguintes	mensagens:	
ACESSO	PERMITIDO	caso	a	senha	seja	v�lida.	
ACESSO	NEGADO	caso	a	senha	seja	inv�lida.*/




public class TestaValidacaoSenha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int senha;

		System.out.println("Digite uma senha de 4 d�gitos: ");
		senha = leia.nextInt();

		if (senha == 1234) {
			System.out.println("Acesso permitido! Senha v�lida");// TODO Auto-generated method stub
		} else {
			System.out.println("Acesso negado! Sua senha � inv�lida.");
		}
	}

}
