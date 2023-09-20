package lacos_do_while;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		int soma=0, numero = 1;
		Scanner leia = new Scanner(System.in);
		
		do{
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			if(numero>0) {
				soma += numero;
				numero = 1;
			}
		}while(numero!=0);
		System.out.printf("\nA soma dos números positivos é: " + soma);
	}
}
