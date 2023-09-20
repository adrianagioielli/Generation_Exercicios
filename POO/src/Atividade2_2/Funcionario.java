package Atividade2_2;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class Funcionario {
	
	//atributos
	private String nome;
	private String cargo;
	private String admissao;
	private String salario;
	
	//	construtora
	public Funcionario(String nome, String cargo, String admissao, String salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.admissao = admissao;
		this.salario = salario;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getAdmissao() {
		return admissao;
	}
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public void exibeFuncionarios() {
		System.out.println("\n");
		System.out.printf("\nNome do funcionário: " + nome + "\nCargo: " + cargo + 
				"\nData de admissão: " + this.verificaData(admissao) + "\nSalário atual: " + this.formatarMoeda());
	}
	//formata salario
	public String formatarMoeda() {
		double s = Double.valueOf(salario);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(s);
		return formatoMoeda;
	}
	//verifica se data de admissão é válida
	public boolean verificaData (String admissao) {
		try {
			SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
			d.setLenient(false);
			d.parse(admissao);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

}
