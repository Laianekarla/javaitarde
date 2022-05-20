/*Suponha que você está desenvolvendo um software para controle de estoque que precisa informar 
como está a quantidade de itens de cada produto: se suficiente, para quantidades superiores a 100;
em alerta, para quantidades entre 100 e 50; e abaixo do ideal, para quantidades menores do que 50. 
Como programar esse código?*/



public class TestaEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int estoque = 45;//valor recuperado do sistema

				if (estoque >= 100) {
					System.out.println("Produto com quantidade suficiente");
				} else if (estoque < 100 && estoque > 50) {
					System.out.println("Alerta: Avaliar possibilidade de novo pedido.");
				} else {
					System.out.println("ATENÇÃO! Faça um novo pedido.");
				}
	}

}
