package Collections_Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio04 {

	public static void main(String[] args) {
		
		int i, busca = 0;	
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numerosSet = new HashSet<Integer>();
		for(i=0; i<10; i++) {
			System.out.printf("\nDigite o número da posição %d: ", i);
			numerosSet.add(leia.nextInt());
		}
				
		System.out.println("\nDigite o número que você deseja encontrar: ");
		busca = leia.nextInt();
		if(numerosSet.contains(busca)) {
			System.out.printf("\nO número %d foi encontrado!", busca);
			}else {
				System.out.printf("\nO número %d não foi encontrado!", busca);
				}
		}
	}
