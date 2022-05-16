package quest�o_2;
import java.util.Scanner; //respons�vel por ler o valor do usu�rio.
/**
 * Classe main respons�vel por fazer o programa funcionar de forma compacta e organizada.
 * Vari�vel 'opcao' � designada a servir como meio de locomo��o para o Menu funcionar.
 * @author Adrian L. Silva
 */
public class Programa {
	public static void main(String [] args) {	
		//Scanner l� o valor do usu�rio.
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		do { //do While para cria��o do Menu.
		System.out.println("-Escolha uma das op��es abaixo-\n");
		System.out.println("Op��o [1] - Calcular o rendimento da sua poupan�a");
		System.out.println("Op��o [2] - Demonstra��o de como calcular o rendimento");
		System.out.println("Op��o [0] - Encerrar o programa.");
		System.out.println("-------------------------------");
		System.out.println("Digite sua op��o aqui: ");
		opcao = Integer.parseInt(sc.nextLine()); //lendo o valor inserido pelo usu�rio.

		if(opcao == 1) {

			RendimentoPoupanca pessoa = new RendimentoPoupanca(); //criando um objeto chamado pessoa para guardar os valores dentro dos m�todos gets e set.
			pessoa.setTaxaRef(0.0006f); ////Valor 0,6% atual da taxa TR (Taxa Referencial). Fonte: https://brasilindicadores.com.br/tr/
			pessoa.setTaxaSelic(12.75f); //Valor 12,75% atual da taxa SELIC. Fonte: https://blog.nubank.com.br/taxa-selic/
			
			System.out.print("D�gite seu nome: ");
			pessoa.setNome(sc.nextLine()); //lendo o valor
			
			System.out.print("Valor inicial que deseja colocar na poupan�a: ");
			pessoa.setValor(Integer.parseInt(sc.nextLine())); //lendo o valor
			
			System.out.print("Por quantos meses pretende deixar rendendo? ");
			pessoa.setQtdMeses(Integer.parseInt(sc.nextLine())); //lendo o valor
			
			System.out.println();
			
			pessoa.calcular(); //chamando o m�todo Calcular
		} else if(opcao == 2) {
			System.out.println("Para calculcar o rendimento �:\nSe a SELIC estiver abaixo de 8.5, a poupan�a rende 70% da SELIC + Taxa Referencial (ao m�s)");
			System.out.println("Se a SELIC estiver acima, a poupan�a rende 0.5% + Taxa Referencial (ao m�s)\n");
		}
		}while(opcao != 0);
	}
}