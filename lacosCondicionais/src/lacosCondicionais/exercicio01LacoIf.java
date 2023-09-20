package lacosCondicionais;
import java.util.Scanner;

/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima
 * na tela se a soma de A + B é maior, menor ou igual a C.
 * */

public class exercicio01LacoIf {
	
	public static void main(String[] args) {

		int a, b, c;
		Scanner numeros =  new Scanner(System.in);
		System.out.println("\nDigite o número A: ");
		a = numeros.nextInt();
		System.out.println("\nDigite o número B: ");
		b = numeros.nextInt();
		System.out.println("\nDigite o número C: ");
		c = numeros.nextInt();
		
		int soma = a + b;
		
		if(soma > c) {
			System.out.println("\nA soma de A + B é maior que C");
		}else if(soma < c) {
			System.out.println("\nA soma de A + B é menor que C");
		 }
		else {
			System.out.println("\nA soma de A + B é igual a C");
		}
	}
}
