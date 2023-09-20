package Atividade01;

public class TestaCliente {

	public static void main(String[] args) {
		//objetos da classe Cliente possuem 5 atributos:
		//nome, email, idade, endereco e cidade
		Cliente[] clientes = new Cliente[2];
		clientes[0] = new Cliente("Maurício Freire", "mfreira_doidao@hotmail.com", 20,
								"Avenida Paulista, 1000", "São Paulo");
		clientes[1] = new Cliente("Thamires Cruz", "thami_gateira@gmail.com", 18,
				"Rua Fenda do Biquini, 74", "Rio de Janeiro");
		
		for(Cliente roda: clientes) {
			roda.visualizar();
		}
	}

}
