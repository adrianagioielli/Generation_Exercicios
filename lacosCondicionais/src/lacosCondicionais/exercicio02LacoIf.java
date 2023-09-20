package lacosCondicionais;
import java.util.Scanner;

/*Escreva um algoritmo em Java que leia um número inteiro via teclado e mostre na tela
 * uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou 
 * negativo.
 * */

public class exercicio02LacoIf {

	public static void main(String[] args) {
		int a;
		Scanner numero =  new Scanner(System.in);
		System.out.println("\nDigite o número: ");
		a = numero.nextInt();
		float paridade = (float) a%2;
		
		if(a>0) {
			if(paridade == 0) {
				System.out.printf("\nO número " +a+ " é par e positivo!");
				}else {
					System.out.printf("\nO número " +a+ " é ímpar e negativo!", a);
					}
			}else {
				if(a<0) {
					if(paridade == 0) {
						System.out.println("\nO número " +a+ " é ímpar e positivo!");
						}else {
							System.out.println("\nO número " +a+ " é ímpar e negativo!");
							}
					}else {
						System.out.println("\nDigite um número diferente de zero");
						}
				}
		}
}
