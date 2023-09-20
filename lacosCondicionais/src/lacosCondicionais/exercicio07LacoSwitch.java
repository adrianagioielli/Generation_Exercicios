package lacosCondicionais;
import java.util.Scanner;

/*Escreva um algoritmo em Java que simule uma calculadora simples.
 * O programa deverá ler dois números float: numero1 e numero2 e, na sequência, ler o
 * código da operação matemática (número de 1 a 4).
 * A seguir mostre na tela o resultado da operação entre os 2 números.
 * Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem
 * "Operação inválida!".
 * */

public class exercicio07LacoSwitch {

	public static void main(String[] args) {
		float numero1, numero2, soma, subtracao, multiplicacao, divisao;
		int operacao;
		Scanner numeros =  new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		numero1 = numeros.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		numero2 = numeros.nextFloat();
		System.out.println("\nOperação: ");
		operacao = numeros.nextInt();
		
		switch(operacao) {
		case 1:
			soma = numero1 + numero2;
			System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, soma);
			break;
		case 2:
			subtracao = numero1 - numero2;
			System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, subtracao);
			break;
		case 3:
			multiplicacao = numero1 * numero2;
			System.out.printf("%.1f x %.1f = %.1f", numero1, numero2, multiplicacao);
			break;
		case 4:
			divisao = numero1/numero2;
			System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, divisao);
			break;
		default:
			System.out.println("Operação inválida!");
		}
	}
}
