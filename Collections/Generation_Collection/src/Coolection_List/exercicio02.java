package Coolection_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		int i, numero, busca = 0;	
		Scanner leia = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<Integer>();
		
		for(i=0; i<10; i++) {
			System.out.printf("\nDigite o número da posição %d: ", i);
			numero = leia.nextInt();
			numeros.add(numero);
		}
		System.out.println("\nDigite o número que você deseja encontrar: ");
		busca = leia.nextInt();
		for(i=0; i<10; i++) {
			if(busca==numeros.get(i)) {
				System.out.printf("\nO número %d está localizado na posição: %d", busca, i);
				}
			}
		if(busca==0) {
			System.out.printf("\nO número %d não foi encontrado!", busca);
		}
		}
	}
