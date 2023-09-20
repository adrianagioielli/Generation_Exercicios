package Atividade01;

public class Cliente {
	
	//atributos do cliente
	private String nome;
	private String email;
	private int idade;
	private String endereco;
	private String cidade;
	
	
	
	// construtor
	public Cliente(String nome, String email, int idade, String endereco, String cidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.endereco = endereco;
		this.cidade = cidade;
	}

	//setters e getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public void setFormaPagamento(String cidade) {
		this.cidade = cidade;
	}
	
	//método visualizar
	public void visualizar() {
		System.out.println("\nNome da(o) cliente: " + nome +
				"\nE-mail: " + email + 
				"\nIdade: " + idade +
				"\nEndereço: " + endereco + 
				"\nCidade: " + cidade);
	}
}
