package quest�o_1;
/**
 * Classe respons�vel por gerenciar o limite de cart�o de cr�dito e dados pessoais da pessoa.
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
	//Limite cart�o de cr�dito.
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getLimite() {
		return limite;
	}
	/**
	 * condi��o 'if' validando se o limite � maior ou menor que a lista de compras.
	 * @param listaCompra valor da lista de compras da pessoa.
	 */
	public void setListaCompra(float listaCompra) {
		if(limite < listaCompra) {
			System.out.println("\n\n[1] - Limite excedido! Ligue para a central para negociar sua divida.");
			this.listaCompra = listaCompra;
		} else {
			System.out.println("\n\n[0] - Limite ainda n�o excedido!");
			this.listaCompra = listaCompra;
		}
	}
	public float getListaCompra() {
		return listaCompra;
	}
}

