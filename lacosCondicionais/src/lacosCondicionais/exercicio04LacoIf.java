package lacosCondicionais;
import java.util.Scanner;

/*Escreva um algortimo em Java que leia 3 palavras (String) que definem as características
 * de um tipo de animal possível (diagrama do enunciado).
 * */

public class exercicio04LacoIf {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		Scanner ler = new Scanner(System.in);
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.nextLine();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = ler.nextLine();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = ler.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			if(palavra2.equalsIgnoreCase("ave")) {
				if(palavra3.equalsIgnoreCase("carnívoro")){
					System.out.println("\nÉ uma águia!");
				}else {
					System.out.println("\nÉ uma pomba!");
				}
			}else {
				if(palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nÉ um ser humano!");
				}
				else {
					System.out.println("\nÉ uma vaca!");
				}
			}
		}else {
			if(palavra2.equalsIgnoreCase("inseto")) {
				if(palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nÉ uma pulga!");
				}else {
					System.out.println("\nÉ uma lagarta!");
				}
			}else {
				if(palavra3.equalsIgnoreCase("hematófago")) {
					System.out.println("\nÉ uma sanguesssuga!");
				}else {
					System.out.println("\nÉ uma minhoca!");
				}
			}
		}

	}

}
