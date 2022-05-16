package questão_2;
import java.text.DecimalFormat; //responsavél por formatar as casas decimais que queremos que seja exibidas. por ex: (0.00)
/**
 * Classe responsavel por calcular o Rendimento da poupança de acordo com as taxas Selic e TR (Taxa Referencial).
 * Variável 'auxValor' é uma auxiliar da variável 'valor', ela é responsável por armazenar o valor do rendimento ao mês.
 * Variável 'somaValor' como o nome já diz, é uma variável responsável por somar o valor do rendimento ao mês junto com a 'auxValor'.
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
	//Variável Auxiliar do valor.
	public float getAuxValor() {
		return auxValor;	
	}
	public void setAuxValor(float auxValor) {
		this.auxValor = auxValor;
	}
	//Variável "Auxiliar" para somar os valores, assim conseguindo exibir o rendimento mês a mês.
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
	 * Método 'calcular' é responsavel por calculcar o rendimento ao mês.
	 * Caso a taxa selic for maior que 8.5% o método faz um conjunto de códigos, caso for menor outro conjunto de códigos.
	 * @return método retorna o valor inicial, rendimento do mês e o valor mês a mês.
	 */
	public float calcular() {
		System.out.println("Ola! Sr(a)." + getNome() + " o valor inicial do seu investimento é: R$" + getValor() + " Reais.");
		DecimalFormat formatador = new DecimalFormat("0.00"); //formatador de decimal. Ele serve para declarar quantas casas queremos exibir após a vírgula.
		if (taxaSelic < 8.5f) {
			//Taxa SELIC maior que 8.5% = valor da pessoa * a qtdMeses * taxa 0,5% + taxaRef = 0.0006.
			valor = valor * qtdMeses * 0.005f + taxaRef;
			auxValor = valor / qtdMeses; //auxValor recebe o resultado do rendimento do mês.
			System.out.println("Taxa SELIC maior que 8.5% então:");
			System.out.println("Após o rendimento de 0,5% (por mês) + TR 0,6 (por mês) é de: R$" + getAuxValor());
			System.out.println("Rendeu aproximandamente: R$" + formatador.format(getAuxValor()) + " por mês, isso é:"); //formatador.format' é responsavél por aproximar um valor 'float'
	        int i = 0; 
			while (!(i++ == qtdMeses)) { //Enquanto [i] não for igual a qtsMeses faça:
				somaValor = somaValor + auxValor;
	            System.out.printf("Mês %d: ", i);
	            System.out.println(formatador.format(getSomaValor())); //aproximando o valor e exibindo o valor do rendimento ao mês.
	        }
			System.out.println("Durante o periodo de " + getQtdMeses() + " meses, renderá cerca de: R$" + formatador.format(getValor()));;
			System.out.println();
			return valor;
		} else {
			//Taxa Selic menor que 8,5% = 70% de 8,5% = 5,95% ao ano, dividindo por 12 mesês = 0,4958% por mês.
			//Convertendo ficamos com 70% = 0,004958 por mês.
			valor = valor * qtdMeses * 0.004958f + taxaRef;
			auxValor = valor / qtdMeses;
			System.out.println("Taxa SELIC menor que 8.5% então:");
			System.out.println("Após o rendimento de 70% da taxa Selic (por mês) + TR 0,6 (por mês) é de: R$ " + getAuxValor());
			System.out.println("Rendeu aproximandamente: R$" + formatador.format(getAuxValor()) + " por mês, isso é:");
			int i = 0;
			while (!(i++ == qtdMeses)) {
				somaValor = somaValor + auxValor;
	            System.out.printf("Mês %d: ", i);
	            System.out.println(formatador.format(getSomaValor()));
	        }
			System.out.println("Durante o periodo de " + getQtdMeses() + " meses, renderá cerca de: R$" + formatador.format(getValor()));
			System.out.println();
			return valor;
		}
	}
}
