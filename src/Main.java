import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
	
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x); //padr�o pra decidir quantas casas decimais eu quero q tenha na sa�da de dados
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US); // Configura��o do local do nosso programa
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO " + x + " METROS"); //concatena��o (juntar)
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); //concatena�ao de varios valores interpolados numa mesma string
	}

}
