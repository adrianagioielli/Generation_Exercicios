package lacos_while;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		int i=0, temp21=0, temp50=0;
		Scanner leia = new Scanner(System.in);
		
		while(i>=0) {
			System.out.println("\nDigite uma idade: ");
			i=leia.nextInt();
			if(i<21&&i>0) {
				temp21++;
			}
			if(i>50) {
					temp50++;
				}
		}
		System.out.printf("\nTotal de pessoas menores de 21 anos: " + temp21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: " + temp50);
	}
}
