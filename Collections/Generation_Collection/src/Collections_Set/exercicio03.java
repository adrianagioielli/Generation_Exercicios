package Collections_Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio03 {

	public static void main(String[] args) {
		int i;	
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numerosSet = new HashSet<Integer>();
		for(i=0; i<10; i++) {
			System.out.printf("\nDigite o número da posição %d: ", i);
			numerosSet.add(leia.nextInt());
		}
		Iterator<Integer> inumerosSet = numerosSet.iterator();
		
		System.out.println("\nListar dados do Set: ");
		while(inumerosSet.hasNext()) {
			System.out.println(inumerosSet.next());
			}
		}
	}

