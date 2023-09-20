package lacos_for;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		int i, j, par=0, impar=0;
		Scanner leia = new Scanner(System.in);
				
		for(i=1; i<11; i++) {
			System.out.printf("\nDigite o %dº número: ", i);
			j = leia.nextInt();
			if(j%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.printf("\nTotal de números pares: " + par);
		System.out.printf("\nTotal de números ímpares: " + impar);
	}
}
