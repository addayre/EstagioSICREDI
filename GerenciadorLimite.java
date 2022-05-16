package questão_1;
/**
 * Classe responsável por gerenciar o limite de cartão de crédito e dados pessoais da pessoa.
 * @author Adrian L. Silva.
 */
public class GerenciadorLimite {
	
	private String nome;
	private float limite;
	private float listaCompra;
	
	//Nome pessoa.
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	//Limite cartão de crédito.
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getLimite() {
		return limite;
	}
	/**
	 * condição 'if' validando se o limite é maior ou menor que a lista de compras.
	 * @param listaCompra valor da lista de compras da pessoa.
	 */
	public void setListaCompra(float listaCompra) {
		if(limite < listaCompra) {
			System.out.println("\n\n[1] - Limite excedido! Ligue para a central para negociar sua divida.");
			this.listaCompra = listaCompra;
		} else {
			System.out.println("\n\n[0] - Limite ainda não excedido!");
			this.listaCompra = listaCompra;
		}
	}
	public float getListaCompra() {
		return listaCompra;
	}
}

