
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		//boolean acompanhado = true;

		if (idade >= 18 || quantidadePessoas >= 2) {
			//if (idade >= 18 && acompanhado)
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente voce n?o pode entrar");
		}
	}
}
