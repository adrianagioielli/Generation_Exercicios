package Atividade02;

import java.text.ParseException;

public class TestaFuncionario {

	public static void main(String[] args) throws ParseException {
		
		//objetos da classe Cliente possuem 5 atributos: nome, salario, admissao, filhos e cargo
		Funcionario[] funcionarios = new Funcionario[2];
		funcionarios[0] = new Funcionario("Maurício Freire", 2000, "10/11/2020", "Não", "Gerente");	
		funcionarios[1] = new Funcionario("Thamires Cruz", 3500, "22/08/2022", "Sim", "Supervisora");
		
		
		
		for(Funcionario roda: funcionarios) {
			roda.visualizar();
		}
	}
	
}
