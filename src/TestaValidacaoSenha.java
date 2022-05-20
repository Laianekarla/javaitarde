import java.util.Scanner;

/*Escreva	 um	 programa	 que	 verifique	 a	 validade	 de	 uma	 senha	 fornecida	
pelo	 usuário.	 A	 senha	 válida	 é	 o	 número	 1234.	Devem	 ser	impressas	 as	
seguintes	mensagens:	
ACESSO	PERMITIDO	caso	a	senha	seja	válida.	
ACESSO	NEGADO	caso	a	senha	seja	inválida.*/




public class TestaValidacaoSenha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int senha;

		System.out.println("Digite uma senha de 4 dígitos: ");
		senha = leia.nextInt();

		if (senha == 1234) {
			System.out.println("Acesso permitido! Senha válida");// TODO Auto-generated method stub
		} else {
			System.out.println("Acesso negado! Sua senha é inválida.");
		}
	}

}
