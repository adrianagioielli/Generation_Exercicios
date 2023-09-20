package Pilha;

import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {
		int opcao;
		String livro;
		Stack<String> livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		
		//Menu
		do {
			System.out.println("*****************************************************");
			System.out.println("            1 - Adicionar livro na pilha             ");
			System.out.println("            2 - Listar todos os livros               ");
			System.out.println("            3 - Retirar livro da pilha               ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 0: //Sair
				System.out.println("\nPrograma finalizado!");
				System.exit(0);
			case 1: //Adicionar um livro na pilha
				System.out.println("\nDigite o nome do livro: ");
				livro = leia.next();
				livros.push(livro);
				
				//System.out.println("\nPilha: " + livros);
				Iterator<String> iterator = livros.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
				System.out.println("\nLivro adicionado!");
				break;
			case 2: //Listar todos os livros
				if(livros.isEmpty()) {
					System.out.println("\nA pilha está vazia");
				}else {
					System.out.println("\nPilha: ");
					Iterator<String> iterator2 = livros.iterator();
	                while (iterator2.hasNext()){
	                    System.out.println(iterator2.next());
	                }
				}
				break;
			case 3: //Retirar livro da pilha
				if(livros.isEmpty()) {
					System.out.println("\nA pilha está vazia");
				}else {
					livros.pop();
					if(livros.isEmpty()) {
						System.out.println("\nA pilha está vazia");
					}else {
						System.out.println("\nPilha: ");
						Iterator<String> iterator3 = livros.iterator();
		                while (iterator3.hasNext()){
		                    System.out.println(iterator3.next());
		                }
					}
					System.out.println("\nUm livro foi retirado da pilha!");
					}
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
			}
		}while(true);
	}
}
