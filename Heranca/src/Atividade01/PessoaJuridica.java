package Atividade01;

public class PessoaJuridica extends Cliente{
	
	//atributos pessoa jurídica
	private String cnpj;
	private String razaoSocial;
	
	//construtor
	public PessoaJuridica(String nomeResponsavel, String email, int idade, String endereco, String cidade,
			String cnpj, String razaoSocial) {
		super(nomeResponsavel, email, idade, endereco, cidade);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	//getters e setters
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	//metodo visualizar cliente pessoa juridica
		public void visualizarEmpresa() {
			System.out.println("\nResponsável pela empresa: " + getNomeResponsavel() + 
					"\nE-mail de contato: " + getEmail() + 
					"\nAno de abertura da empresa: " + getIdade() + 
					"\nEndereço de correspondência: " + getEndereco() + 
					"\nCidade: " + getCidade() + 
					"\nNúmero CNPJ: " + getCnpj() + "\nRazão Social: " + getRazaoSocial());
		}	

}
