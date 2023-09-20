package Atividade02;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Funcionario {
	
	//atributos
	private String nome;
	private double salario;
	private Date admissao;
	private String filhos;
	private String cargo;
	
	//construtor
	public Funcionario(String nome, double salario, String admissao, String filhos, String cargo) throws ParseException {
		super();
		this.nome = nome;
		this.salario = salario;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.admissao = formato.parse(admissao);
		this.filhos = filhos;
		this.cargo = cargo;
	}
	
	//getters e settes
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Date getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public String getFilhos() {
		return filhos;
	}
	public void setFilhos(String filhos) {
		this.filhos = filhos;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	//formatar moeda do salário
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	//formatar data de admissão
	public String formatarAdmissao() throws ParseException{
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String df = formato.format(admissao);		
		return df;
	}
	
	public static Boolean verificaData(String data) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d = formato.parse(data);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	//método visualizar
	public void visualizar() throws ParseException {
		System.out.println("\nFuncionário: " + nome +
				"\nSalário: " + this.formatarMoeda() + 
				"\nData de admissão (DD/MM/AAAA): " + this.formatarAdmissao() + 
				"\nPossui filhos (S/N): " + filhos +
				"\nCargo na empresa: " + cargo);
	}
	
	

}
