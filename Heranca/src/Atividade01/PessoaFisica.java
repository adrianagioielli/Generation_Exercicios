package Atividade01;

public class PessoaFisica extends Cliente{
	
	//atributos pessoa física
	private String cpf;
	private String rg;
	
	//construtora
	public PessoaFisica(String nomeResponsavel, String email, int idade, String endereco,
			String cidade, String cpf, String rg) {
		super(nomeResponsavel, email, idade, endereco, cidade);
		this.cpf = cpf;
		this.rg = rg;
	}

	//getters e setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	//metodo visualizar cliente pessoa física
	public void visualizarCliente() {
		System.out.println("\nNome do cliente: " + getNomeResponsavel() + 
				"\nE-mail de contato: " + getEmail() + 
				"\nIdade do responsável: " + getIdade() + 
				"\nEndereço de correspondência: " + getEndereco() + 
				"\nCidade: " + getCidade() + 
				"\nNúmero CPF: " + getCpf() + "\nNúmero RG: " + getRg());
	}
}
