package lacosCondicionais;
import java.util.Scanner;

/*Para doar sangue é necessário ter entre 18 e 69 anos de idade.
 * Pessoas com idade  * entre 60 e 69 anos só podem doar se não for a sua primeira doação.
 * Escreva um algoritmo em Java que obtenha via teclado o nome do doador (String),
 * a idade (inteiro) do doador e se é a primeira doação (boolean).
 * De acordo com as regras para a doação, mostre na tela se o doador está apto ou não
 * apto para doar sangue.
 */

public class exercicio03LacoIf {

	public static void main(String[] args) {
		int idade;
		boolean primeiraDoacao;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do doador");
		nome = ler.nextLine();
		System.out.println("\nDigite a idade do doador");
		idade = ler.nextInt();
		System.out.println("\nPrimeira Doação de Sangue?");
		primeiraDoacao = ler.nextBoolean();
		
		if((idade>=18&&idade<=69)&&((idade>=60||idade<=69)&&(primeiraDoacao == false))) {
				System.out.println("\n"+nome+" está apto(a) para doar Sangue!");
		}else {
				System.out.println("\n"+nome+" não está apto(a) para doar Sangue!");
			}
		
		if (nome == "s") {
			System.out.println("foi");
		}
	}
}
