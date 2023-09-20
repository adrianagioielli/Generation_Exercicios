package Atividade01;

public class Cliente {
	//atributos de clientes
	private String nomeResponsavel;
	private String email;
	private int idade;
	private String endereco;
	private String cidade;
	
	//construtora
	public Cliente(String nomeResponsavel, String email, int idade, String endereco, String cidade) {
		super();
		this.nomeResponsavel = nomeResponsavel;
		this.email = email;
		this.idade = idade;
		this.endereco = endereco;
		this.cidade = cidade;
	}

	//getters e setters
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
