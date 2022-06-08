package parteDois;

public class ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array - armazena valores do mesmo tipo
		// sintaxe - tipo[] nomeVariavel = new tipo[5];
		
		String[] nomes = new String[5];
		
		/*string[] nomes = new String[]{
		" ", " "         passar a quantidade do meu vetor
	}
	
	*/
	
		
		nomes[0] = "Laiane";
		nomes[1] = "Laisa";
		nomes[2] = "Camila";
		nomes[3] = "Vitoria";
		nomes[4] = "Monaline";
		
		System.out.println(nomes[0]);
		System.out.println(nomes[4]);
		
		
		
		/* for(int posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++){
		 * System.out.print(nomes[posicaoVetor] + " ");
		 * 
		 * para imprimir todas as posicoes do meu vetor utilizando o laço de repetição
		 */
	}

}
