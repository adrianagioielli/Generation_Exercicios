package lacosCondicionais;
import java.util.Scanner;

/*Escreva um algorimo em Java que leia o código de um item (número inteiro de 1 a 6) e a 
 * quantidade comprada deste item (número inteiro).
 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
 * */

public class exercicio05LacoSwitch {

	public static void main(String[] args) {
		int item, quantidade = 1;
		float total;		
		Scanner numeros =  new Scanner(System.in);
		
		System.out.println("\nDigite o código do produto: ");
		item = numeros.nextInt();
		System.out.println("\nDigite a quantidade de itens: ");
		quantidade = numeros.nextInt();
		
		switch(item) {
		case 1:
			total = (float)10*quantidade;
			System.out.println("\nProduto: Cachorro Quente");
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 2:
			total = (float)15*quantidade;
			System.out.println("\nProduto: X-Salada");
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 3:
			total = (float)18*quantidade;
			System.out.println("\nProduto: X-Bacon");
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 4:
			total = (float)12*quantidade;
			System.out.println("\nProduto: Bauru");
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 5:
			total = (float)8*quantidade;
			System.out.println("\nProduto: Refrigerante");
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		case 6:
			total = (float)13*quantidade;
			System.out.println("\nProduto: Suco de laranja");
			System.out.printf("\nValor total: R$ %.2f", total);
			break;
		default:
			System.out.println("Não existe essa opção");
		}
	}
}
