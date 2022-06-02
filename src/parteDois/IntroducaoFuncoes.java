package parteDois;

import java.util.Scanner;

public class IntroducaoFuncoes {

	public static void main(String[] args) { //metodo padrao
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		sc.close();
		}
	
	public static int max(int x, int y, int z) { //metodo pra encontrar o maior numero
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) { //metodo pra mostrar o valor 
		System.out.println("Higher = " + value);
	}

}
