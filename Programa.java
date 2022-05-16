package questão_2;
import java.util.Scanner; //responsável por ler o valor do usuário.
/**
 * Classe main responsável por fazer o programa funcionar de forma compacta e organizada.
 * Variável 'opcao' é designada a servir como meio de locomoção para o Menu funcionar.
 * @author Adrian L. Silva
 */
public class Programa {
	public static void main(String [] args) {	
		//Scanner lê o valor do usuário.
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		do { //do While para criação do Menu.
		System.out.println("-Escolha uma das opções abaixo-\n");
		System.out.println("Opção [1] - Calcular o rendimento da sua poupança");
		System.out.println("Opção [2] - Demonstração de como calcular o rendimento");
		System.out.println("Opção [0] - Encerrar o programa.");
		System.out.println("-------------------------------");
		System.out.println("Digite sua opção aqui: ");
		opcao = Integer.parseInt(sc.nextLine()); //lendo o valor inserido pelo usuário.

		if(opcao == 1) {

			RendimentoPoupanca pessoa = new RendimentoPoupanca(); //criando um objeto chamado pessoa para guardar os valores dentro dos métodos gets e set.
			pessoa.setTaxaRef(0.0006f); ////Valor 0,6% atual da taxa TR (Taxa Referencial). Fonte: https://brasilindicadores.com.br/tr/
			pessoa.setTaxaSelic(12.75f); //Valor 12,75% atual da taxa SELIC. Fonte: https://blog.nubank.com.br/taxa-selic/
			
			System.out.print("Dígite seu nome: ");
			pessoa.setNome(sc.nextLine()); //lendo o valor
			
			System.out.print("Valor inicial que deseja colocar na poupança: ");
			pessoa.setValor(Integer.parseInt(sc.nextLine())); //lendo o valor
			
			System.out.print("Por quantos meses pretende deixar rendendo? ");
			pessoa.setQtdMeses(Integer.parseInt(sc.nextLine())); //lendo o valor
			
			System.out.println();
			
			pessoa.calcular(); //chamando o método Calcular
		} else if(opcao == 2) {
			System.out.println("Para calculcar o rendimento é:\nSe a SELIC estiver abaixo de 8.5, a poupança rende 70% da SELIC + Taxa Referencial (ao mês)");
			System.out.println("Se a SELIC estiver acima, a poupança rende 0.5% + Taxa Referencial (ao mês)\n");
		}
		}while(opcao != 0);
	}
}