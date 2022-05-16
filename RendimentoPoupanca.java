package quest�o_2;
import java.text.DecimalFormat; //responsav�l por formatar as casas decimais que queremos que seja exibidas. por ex: (0.00)
/**
 * Classe responsavel por calcular o Rendimento da poupan�a de acordo com as taxas Selic e TR (Taxa Referencial).
 * Vari�vel 'auxValor' � uma auxiliar da vari�vel 'valor', ela � respons�vel por armazenar o valor do rendimento ao m�s.
 * Vari�vel 'somaValor' como o nome j� diz, � uma vari�vel respons�vel por somar o valor do rendimento ao m�s junto com a 'auxValor'.
 * @author Adrian L. Silva.
 */
public class RendimentoPoupanca {
	private String nome;
	private float taxaSelic, taxaRef;
	private float valor, auxValor, somaValor;
	public int qtdMeses;
	//nome Fisico.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//taxa Selic.
	public float getTaxaSelic() {
		return taxaSelic;
	}
	public void setTaxaSelic(float taxaSelic) {
		this.taxaSelic = taxaSelic;
	}
	//Taxa referencial.
	public float getTaxaRef() {
		return taxaRef;
	}
	public void setTaxaRef(float taxaRef) {
		this.taxaRef = taxaRef;
	}
	//Valor inserido pela pessoa.
	public float getValor() {
		return valor;	
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	//Vari�vel Auxiliar do valor.
	public float getAuxValor() {
		return auxValor;	
	}
	public void setAuxValor(float auxValor) {
		this.auxValor = auxValor;
	}
	//Vari�vel "Auxiliar" para somar os valores, assim conseguindo exibir o rendimento m�s a m�s.
	public float getSomaValor () {
		return somaValor;
	}
	//Quantidade de meses.
	public int getQtdMeses() {
		return qtdMeses;
	}
	public void setQtdMeses(int qtdMeses) {
		this.qtdMeses = qtdMeses;
	}
	/**
	 * M�todo 'calcular' � responsavel por calculcar o rendimento ao m�s.
	 * Caso a taxa selic for maior que 8.5% o m�todo faz um conjunto de c�digos, caso for menor outro conjunto de c�digos.
	 * @return m�todo retorna o valor inicial, rendimento do m�s e o valor m�s a m�s.
	 */
	public float calcular() {
		System.out.println("Ola! Sr(a)." + getNome() + " o valor inicial do seu investimento �: R$" + getValor() + " Reais.");
		DecimalFormat formatador = new DecimalFormat("0.00"); //formatador de decimal. Ele serve para declarar quantas casas queremos exibir ap�s a v�rgula.
		if (taxaSelic < 8.5f) {
			//Taxa SELIC maior que 8.5% = valor da pessoa * a qtdMeses * taxa 0,5% + taxaRef = 0.0006.
			valor = valor * qtdMeses * 0.005f + taxaRef;
			auxValor = valor / qtdMeses; //auxValor recebe o resultado do rendimento do m�s.
			System.out.println("Taxa SELIC maior que 8.5% ent�o:");
			System.out.println("Ap�s o rendimento de 0,5% (por m�s) + TR 0,6 (por m�s) � de: R$" + getAuxValor());
			System.out.println("Rendeu aproximandamente: R$" + formatador.format(getAuxValor()) + " por m�s, isso �:"); //formatador.format' � responsav�l por aproximar um valor 'float'
	        int i = 0; 
			while (!(i++ == qtdMeses)) { //Enquanto [i] n�o for igual a qtsMeses fa�a:
				somaValor = somaValor + auxValor;
	            System.out.printf("M�s %d: ", i);
	            System.out.println(formatador.format(getSomaValor())); //aproximando o valor e exibindo o valor do rendimento ao m�s.
	        }
			System.out.println("Durante o periodo de " + getQtdMeses() + " meses, render� cerca de: R$" + formatador.format(getValor()));;
			System.out.println();
			return valor;
		} else {
			//Taxa Selic menor que 8,5% = 70% de 8,5% = 5,95% ao ano, dividindo por 12 mes�s = 0,4958% por m�s.
			//Convertendo ficamos com 70% = 0,004958 por m�s.
			valor = valor * qtdMeses * 0.004958f + taxaRef;
			auxValor = valor / qtdMeses;
			System.out.println("Taxa SELIC menor que 8.5% ent�o:");
			System.out.println("Ap�s o rendimento de 70% da taxa Selic (por m�s) + TR 0,6 (por m�s) � de: R$ " + getAuxValor());
			System.out.println("Rendeu aproximandamente: R$" + formatador.format(getAuxValor()) + " por m�s, isso �:");
			int i = 0;
			while (!(i++ == qtdMeses)) {
				somaValor = somaValor + auxValor;
	            System.out.printf("M�s %d: ", i);
	            System.out.println(formatador.format(getSomaValor()));
	        }
			System.out.println("Durante o periodo de " + getQtdMeses() + " meses, render� cerca de: R$" + formatador.format(getValor()));
			System.out.println();
			return valor;
		}
	}
}
