package Atividade01;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pessoa física: PessoaFisica(nomeResponsavel, email, idade, endereco, cidade, cpf, rg)
		PessoaFisica pessoa1 = new PessoaFisica("Adriana Gioielli", "adriana@mundo.com", 20, "Rua Feliz, 13",
				"São Paolo", "12345678910", "123456789");
		PessoaFisica pessoa2 = new PessoaFisica("Maria da Silva", "maria@mundotodo.com", 25, "Avenida Inacreditavel, 15",
				"São Paolo", "01987654321", "987654321");
		
		//Pessoa jurídica: PessoaJuridica(nomeResponsavel, email, idade, endereco, cidade, cnpj, razaoSocial)
		PessoaJuridica empresa1 = new PessoaJuridica("Adriana Gioielli", "bonequinhasdepano@mundo.com", 2020, 
				"Rua Feliz, 13", "São Paolo", "12345678000910", "Bonequinhas de Pano");
		PessoaJuridica empresa2 = new PessoaJuridica("José dos Santos", "josedaempilhadeira@mundotodo.com", 2018,
				"Avenida Inacreditavel, 15", "São Paolo", "9876543200010", "José serviços de logística");

		
		//mostra os clientes cadastrados
		pessoa1.visualizarCliente();
		pessoa2.visualizarCliente();
		empresa1.visualizarEmpresa();
		empresa2.visualizarEmpresa();
		}
}
