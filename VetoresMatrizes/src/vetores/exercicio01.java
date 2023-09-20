package vetores;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {


		int posicao, valor, leitura, contador = 0;
		int [] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
				
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		leitura = leia.nextInt();
		for(posicao = 0; posicao < 10; posicao++) {
			if(leitura == numeros[posicao]){
				System.out.println("\n O número " + leitura + " está localizado na posição " + posicao);
				contador++;
			}
		}
		if(contador == 0) {
				System.out.printf("\nO número %d não foi encontrado!", leitura);
			}
	}
}