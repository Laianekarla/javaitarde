import java.util.Scanner;

public class ValidacaoSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int senha = 0;
		System.out.println("Digite sua senha de 4 dígitos ");
		senha = sc.nextInt();

		/*
		 * if(senha == 2002) { System.out.println("ACESSO PERMITIDO"); } else {
		 * System.out.println("Senha inválida! digite novamente.."); }
		 */
		

		while (senha != 2002) {
			System.out.println("Senha invalida, digite novamente...");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		sc.close();

	}

}
