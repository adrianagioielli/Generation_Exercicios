package matrizes;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		int i, j;
		float valor = 0, somaLinha = 0;
		float[][] turma = new float[10][4];
		float [] aluno = new float[10];
		Scanner leia = new Scanner(System.in);
		
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 4; j++) {
			System.out.printf("\nDigite a nota do aluno %d: ", (i + 1));
			valor = leia.nextFloat();
			somaLinha += valor;
			aluno[i] = somaLinha;
			turma[i][j] = valor;
			}
		}
		for(i = 0; i < 10; i++) {
			aluno[i] = aluno[i]/4;
			System.out.printf(" " + aluno[i]);
		}
		/*
		for(i = 0; i < 10; i++) {
			System.out.println("\n");
			for(j = 0; j < 4; j++) {
				System.out.printf(" "+ turma[i][j]);
			}
		}*/
	}
}
