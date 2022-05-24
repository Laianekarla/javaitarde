import java.util.Locale;

public class TesteFixacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'f';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		Locale.setDefault(Locale.US);
		System.out.printf("%s, which price is R$ %.2f%n", product1, price1);
		System.out.printf("%s, which price is R$ %.2f%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: F%n", age , code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded: %.3f %n", measure);
		
	}

}
