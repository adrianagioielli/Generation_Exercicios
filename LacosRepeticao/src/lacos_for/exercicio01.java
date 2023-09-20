package lacos_for;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		int n1, n2, temp1, temp2;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o último número do intervalo: ");
		n2 = leia.nextInt();
		
		if(n1>=n2) {
			System.out.println("\nIntervalo inválido! ");
			System.out.println("\nDigite o primeiro número do intervalo: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite o último número do intervalo: ");
			n2 = leia.nextInt();
		}
		
		for(temp1=n1; temp1<=n2; temp1++) {
			if((temp1%3 == 0)&&(temp1%5==0)) {
				System.out.printf("\n %d é múltiplo de 3 e 5", temp1); 
			};
			
		}
	}

}
