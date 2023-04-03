package principal;

import java.util.Scanner;

import entidades.ProfessorSenior;
import entidades.ProfessorPleno;
import entidades.ProfessorJunior;
import servico.SalarioServico;

public class principal {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in); //Classe do próprio Java
		ProfessorSenior proSenior = new ProfessorSenior();
		ProfessorPleno proPleno = new ProfessorPleno();
		ProfessorJunior proJunior = new ProfessorJunior();
		SalarioServico seSalarioServico = new SalarioServico();

		System.out.println("###Cadastro de Professor###");
		
		//######################################################################
		//#################### CADASTRO DO PROFESSOR SENIOR ####################
		//######################################################################
		
		System.out.println("***Cadastro de Professor Senior***");
		System.out.println("Digite o nome do professor Senior:");
		proSenior.nome = entradaDados.next();
		System.out.println("Digite o cpf do professor Senior:");
		proSenior.nome = entradaDados.next();
		System.out.println("Digite as horas do professor Senior:");
		proSenior.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());
		
		proSenior.valorHorasTrabalhadas = 100;
		proSenior.irSenior = 10;

		//Calcular o salário Bruto
		proSenior.salario = seSalarioServico.calcularSalBruto(proSenior.qtdHorasTrabalhadas, proSenior.valorHorasTrabalhadas);
		
		//Calcular o salário Liquido
		proSenior.salarioLiquido = seSalarioServico.calcularSalLiquido(proSenior.salario, proSenior.irSenior);
		
		//#################### CADASTRO DO PROFESSOR PLENO ###################
		System.out.println("***Cadastro de Professor Pleno***");
		System.out.println("Digite o nome do professor Pleno:");
		proPleno.nome = entradaDados.next();
		System.out.println("Digite o cpf do professor Pleno:");
		proPleno.nome = entradaDados.next();
		System.out.println("Digite as horas do professor Pleno:");
		proPleno.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());		
		
		proPleno.valorHorasTrabalhadas = 80;
		proPleno.irPleno = 7;		
		
		//Calcular o salário Bruto
		proPleno.salario = seSalarioServico.calcularSalBruto(proPleno.qtdHorasTrabalhadas, proPleno.valorHorasTrabalhadas);
		
		//Calcular o salário Liquido
		proPleno.salarioLiquido = seSalarioServico.calcularSalLiquido(proPleno.salario, proPleno.irPleno);		
		
		//#####################################################################
		//#################### CADASTRO DO PROFESSOR JUNIOR ###################
		//#####################################################################
		
		System.out.println("***Cadastro de Professor Junior***");
		System.out.println("Digite o nome do professor Junior:");
		proJunior.nome = entradaDados.next();
		System.out.println("Digite o cpf do professor Junior:");
		proJunior.nome = entradaDados.next();
		System.out.println("Digite as horas do professor Junior:");
		proJunior.qtdHorasTrabalhadas = Integer.parseInt(entradaDados.next());		
		
		proJunior.valorHorasTrabalhadas = 60;
		proJunior.irJunior = 5;		
		
		//Calcular o salário Bruto
		proJunior.salario = seSalarioServico.calcularSalBruto(proJunior.qtdHorasTrabalhadas, proJunior.valorHorasTrabalhadas);
		
		//Calcular o salário Liquido
		proJunior.salarioLiquido = seSalarioServico.calcularSalLiquido(proJunior.salario, proJunior.irJunior);			
		
		
		//##########################################################
		//#################### IMPRIMIR CÁLCULOS ###################
		//##########################################################
		
		System.out.println("O salário do professor Senior é: " + proSenior.salario);
		System.out.println("O salário liquido do professor Senior é: " + proSenior.salarioLiquido);
		
		System.out.println("O salário do professor Pleno é: " + proPleno.salario);
		System.out.println("O salário liquido do professor Penior é: " + proPleno.salarioLiquido);
		
		System.out.println("O salário do professor Junior é: " + proJunior.salario);
		System.out.println("O salário liquido do professor Junior é: " + proJunior.salarioLiquido);
	}

}
