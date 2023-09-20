package lacos_do_while;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		int soma = 0, numero = 0, cont = 0;
		float media = 0;
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if(((numero % 3) == 0)&&(numero != 0)) {
				soma += numero;
				cont++;
			}
		}while(numero!=0);
		media = (float)soma/cont;
		System.out.printf("\nA média de todos os números múltiplos de 3 é: " + media);
	}
}
