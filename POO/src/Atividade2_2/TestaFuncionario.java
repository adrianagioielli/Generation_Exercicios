package Atividade2_2;

import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		//inicializacao
		int f = 0, i = 0, j = 0;
		String n, c, a, s; 
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite quantos funcionários deseja cadastrar: ");
		i = leia.nextInt();
		Funcionario[] lista = new Funcionario[i];

		//leitura externa
		while(f<i) {
			System.out.printf("\nFuncionário %d: ", f);
			System.out.println("\nNome: ");
			n = leia.next();
			System.out.println("\nCargo: ");
			c = leia.next();
			System.out.println("\nData de admissão (dd/mm/aaaa): ");
			a = leia.next();
			System.out.println("\nSalário atual: ");
			s = leia.next();
			lista[j] = new Funcionario(n, c, a, s);
			f++;
			}
		//exibir funcionarios
		for(Funcionario roda: lista) {
			roda.exibeFuncionarios();
		}
		
		
	}
}
