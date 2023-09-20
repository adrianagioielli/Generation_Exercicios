package vetores;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		//contadores
		int i, j, k;
		//variaveis
		int posicao, valor, soma = 0;
		float media = 0;
		//vetores
		int [] vetor = new int[10];
		int [] indImpar = new int[10];
		int [] pares = new int[10];
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite 10 números");
		//lê números inseridos pelo usuário
		for(posicao = 0; posicao < 10; posicao++) {
			System.out.println("\nEntre com um número: ");
			valor = leia.nextInt();
			vetor[posicao] = valor;
		}
		
		//percorre vetor atribuindo o conteúdo a variavel valor
		for(posicao = 0, i=0, j = 0; posicao < 10; posicao++) {
			valor = vetor[posicao];
			soma +=valor;
			//verifica valores pares
			if((valor%2)==0) {
				pares[i] = valor;
				i++;
			}
			//verifica posicoes impares
			if(posicao%2!=0) {
				indImpar[j] = valor;
				j++;
			}
		}
		System.out.println("\nElementos dos índices ímpares: ");
		for(k = 0; k < j; k++) {
			System.out.printf(" " + indImpar[k]);
		}
		System.out.println("\nElementos pares: ");
		for(k = 0; k < i; k++) {
			System.out.printf(" " + pares[k]);
		}
		System.out.printf("\nSoma: " + soma);
		media = (float)soma/10;
		System.out.printf("\nMédia: " + media);

	}

}
