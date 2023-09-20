package lacos_while;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		String opcao = "s";
		//contadores
		int i = 0, j = 0;
		//itens do questionário
		int idade = 0, sexo = 0, categoria = 0;
		//itens de comparação
		int colabFemFront = 0, colabBack = 0, colabMaleMobi = 0, colabFemFull = 0;
		//dados coletados
		int[][] colaborador = null; 
		
		Scanner leia = new Scanner(System.in);
		
		while(opcao.equals("s")||opcao.equals("S")){
			int[][] adicionar = new int[i + 1][3];
			int k = 0;
			while (k < i) {
				adicionar[k][0] = colaborador[k][0];
				adicionar[k][1] = colaborador[k][1];
				adicionar[k][2] = colaborador[k][2];
				k++;
			}
			colaborador = adicionar;
			System.out.println("\nDigite sua idade: ");
			colaborador[i][0]=leia.nextInt();
			System.out.println("\nDigite seu sexo: "
					+ "\n1 - Masculino; "
					+ "\n2 - Feminino; "
					+ "\n3 - Outros. "
					+ "\nOpção: ");
			colaborador[i][1]=leia.nextInt();
			System.out.println("\nDigite sua categoria: "
					+ "\n1 - Backend; "
					+ "\n2 - Frontend; "
					+ "\n3 - Mobile; "
					+ "\n4 - FullStack. "
					+ "\nOpção:");
			colaborador[i][2] = leia.nextInt();
			i++;
			System.out.println("\nDeseja continuar? (S/N): ");
			opcao = leia.next();
		}
		while(j < i){
			idade = colaborador[j][0];
			sexo = colaborador[j][1];
			categoria = colaborador[j][2];
			//pessoas colaboradoras
			if((categoria == 1)) {
				colabBack++;
				}
			//mulheres frontend
			if((sexo == 2)&&(categoria == 2)) {
				colabFemFront++;
				}
			//homens mobile >40
			if((idade > 40)&&(sexo == 1)&&(categoria == 3)) {
				colabMaleMobi++;
				}
			//mulheres fullstack <30
			if((idade < 30)&&(sexo == 2)&&(categoria == 4)) {
				colabFemFull++;
				}
			j++;
			}
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: " + colabBack);
		System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: " + colabFemFront);
		System.out.printf("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: " + colabMaleMobi);
		System.out.printf("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: " + colabFemFull);
		}
	}
