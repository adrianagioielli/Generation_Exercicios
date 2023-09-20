package matrizes;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		//contadores
				int i, j, k;
				//variaveis
				int linha = 0, coluna = 0, valor, somaP = 0, somaS = 0;
				//vetores
				int [][] matriz = new int[3][3];
				int [] dPrincipal = new int[3];
				int [] dSecundaria = new int[3];
				Scanner leia = new Scanner(System.in);
		
				for(i = 0; i < 3; i++) {
					for(j = 0; j < 3; j++) {
						System.out.printf("\nDigite o elemento da linha %d coluna %d: ", i, j);
						valor = leia.nextInt();
						matriz[i][j] = valor;
						if(i == j) {
							dPrincipal[linha] = valor;
							linha++;
							somaP += valor;
						}
						//os índices da diagonal de qualquer matriz quadrada somados são iguais
						//a ordem da matriz menos um
						if((i+j)==2) {
							dSecundaria[coluna] = valor;
							coluna++;
							somaS += valor;
						}
					}
				}
				System.out.println("\n Elementos diagonal principal: ");
				for(i = 0; i < 3; i++) {
					System.out.printf(" " + dPrincipal[i]);
				}
				System.out.println("\n Elementos diagonal secundária: ");
				for(i = 0; i < 3; i++) {
					System.out.printf(" " + dSecundaria[i]);
				}
				System.out.println("\nSoma dos elementos da diagonal principal: " + somaP);
				System.out.println("\nSoma dos elementos da diagonal secundária: " + somaS);
	}

}

/*imprime matriz
 * for(i = 0; i < 3; i++) {
					System.out.println("\n");
					for(j = 0; j < 3; j++) {
						System.out.printf(" "+ matriz[i][j]);
					}
				}*/
