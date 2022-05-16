package quest�o_1;
/**
 * Classe main, onde o gerenciamento do cart�o de cr�dito acontece de forma pr�tica e organizada.
 * @author Adrian L Silva
 */
public class Programa {
	public static void main(String [] args) {
		
		//Objeto pessoa.
		GerenciadorLimite pessoa = new GerenciadorLimite();
		
		//atribuindo valores.
		pessoa.setNome("Adrian");
		pessoa.setLimite(1000.55f);
		
		//exibindo as informa��es:
		System.out.print("Ol� Sr." + pessoa.getNome() + " Seu limite � de: R$" + pessoa.getLimite() + " Reais.");
		
		//atribuindo valor a lista de compras da pessoa
		pessoa.setListaCompra(2000f);
		
		//exibindo os dados da listas de compras:
		System.out.println("O valor total da sua lista de compra � de: R$" + pessoa.getListaCompra() + " Reais.");	
	}	
}

