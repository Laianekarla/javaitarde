import java.util.Scanner;

public class ExerciciosTresWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		while (numero != 4) {
			if (numero == 1) {
				System.out.println("Alcool: 1");
			} else if (numero == 2) {
				System.out.println("Gasolina : 2");
			} else if (numero == 3) {
				System.out.println("Diesel : 3");
			} else {
				System.out.println("Codígo inválido, digite novamente");
			}

			numero = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO!! ");

	}

}
