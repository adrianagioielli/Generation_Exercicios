package Fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Fila {

	public static void main(String[] args) {
		
		int opcao;
		String cliente;
		Queue<String> clientes = new LinkedList<String>();
		Iterator<String> iterator = clientes.iterator();
		Scanner leia = new Scanner(System.in);
		
		//Menu
		do {
			System.out.println("*****************************************************");
			System.out.println("            1 - Adicionar cliente na fila            ");
			System.out.println("            2 - Listar todos os clientes             ");
			System.out.println("            3 - Retirar cliente da fila              ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("\nEntre com a opção desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 0: //Sair
				System.out.println("\nPrograma finalizado!");
				System.exit(0);
			case 1: //Adicionar cliente na fila
				System.out.println("\nDigite o nome: ");
				cliente = leia.next();
				clientes.add(cliente);
				System.out.println("\nFila: ");
				Iterator<String> iterator1 = clientes.iterator();
                while (iterator1.hasNext()){
                    System.out.println(iterator1.next());
                }
				System.out.println("\nCliente adicionado!");
				break;
			case 2: //Listar todos os clientes
				if(clientes.isEmpty()) {
					System.out.println("\nA fila está vazia");
				}else {
					System.out.println("\nFila: ");
					Iterator<String> iterator2 = clientes.iterator();
	                while (iterator2.hasNext()){
	                    System.out.println(iterator2.next());
	                }
				}
				break;
			case 3: //Retirar cliente da fila
				if(clientes.isEmpty()) {
					System.out.println("\nA fila está vazia");
				}else {
					clientes.remove();
					if(clientes.isEmpty()) {
						System.out.println("\nA fila está vazia");
					}else {
						System.out.println("\nFila: ");
						Iterator<String> iterator3 = clientes.iterator();
		                while (iterator3.hasNext()){
		                    System.out.println(iterator3.next());
		                }
					}
					System.out.println("\nCliente foi chamado!");
					}
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;
					
			}
		}while(true);
	}
}
