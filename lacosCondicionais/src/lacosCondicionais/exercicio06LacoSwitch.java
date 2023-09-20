package lacosCondicionais;
import java.util.Scanner;


/*Escreva um algoritmo em java que leia o nome do colaborador (String), o código do cargo do
 * colaborador (Número inteiro de 1 a 6) e o salário (número float).
 * A seguir mostre na tela o nome do colaborador, o cargo e o novo salário.
 * */
public class exercicio06LacoSwitch {

	public static void main(String[] args) {
		String colaborador;
		int cargo;
		float salario;
		double novo;
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do colaborador: ");
		colaborador = dados.nextLine();
		System.out.println("\nDigite o cargo do colaborador: ");
		cargo = dados.nextInt();
		System.out.println("\nDigite o salário do colaborador: ");
		salario = dados.nextFloat();
		
		switch(cargo) {
		
		case 1:
			novo = (float) (salario + (0.1 * salario));
			System.out.println("\nNome do colaborador: " + colaborador);
			System.out.println("\nCargo: Gerente");
			System.out.printf("salario R$ %.2f", novo);
			break;
		case 2:
			novo = (float) (salario + (0.07 * salario));
			System.out.println("\nNome do colaborador: " + colaborador);
			System.out.println("\nCargo: Vendedor");
			System.out.printf("salario R$ %.2f", novo);
			break;
		case 3:
			novo = (float) (salario + (0.09 * salario));
			System.out.println("\nNome do colaborador: " + colaborador);
			System.out.println("\nCargo: Supervisor");
			System.out.printf("salario R$ %.2f", novo);
			break;
		case 4:
			novo = (float) (salario + (0.06 * salario));
			System.out.println("\nNome do colaborador: " + colaborador);
			System.out.println("\nCargo: Motorista");
			System.out.printf("salario R$ %.2f", novo);
			break;
		case 5:
			novo = (float) (salario + (0.05 * salario));
			System.out.println("\nNome do colaborador: " + colaborador);
			System.out.println("\nCargo: Estoquista");
			System.out.printf("salario R$ %.2f", novo);
			break;
		case 6:
			novo = (float) (salario + (0.08 * salario));
			System.out.println("\nNome do colaborador: " + colaborador);
			System.out.println("\nCargo: Técnico de TI");
			System.out.printf("salario R$ %.2f", novo);
			break;
		default:
			System.out.println("\nCódigo inválido!");
		}
	}
}
