package servicos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import cadastro.aluno;
import cadastro.professor;
import cadastro.coordenador;


public class manipulaArquivo {
	
	
public static void escreverNoArqAluno(String enderecoArquivo, aluno cadaluno) {
		
		
		try {
			String texto1 = "Nome do aluno: " + cadaluno.getNome();
			String texto2 = "Matricula do aluno: " + cadaluno.getMatricula();
			String texto3 = "Turma do aluno: " + cadaluno.getTurma();
			
			BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			buWriter.newLine(); 
			buWriter.append(texto1 + "\n" + texto2 + "\n" + texto3);
			buWriter.close();
			System.out.println("Aluno registrado com sucesso!");
			
			
			
		}catch (IOException mensagemErro) {
			System.out.println("Erro ao registrar aluno" + mensagemErro);
		
		}
	
	}


public static void escreverNoArqProf(String enderecoArquivo, professor cadprof) {
	
	
	try {
		String texto1 = "Nome do professor: " + cadprof.getNome();
		String texto2 = "Matricula do professor: " + cadprof.getMatricula();
		String texto3 = "Disciplina do professor: " + cadprof.getDisciplina();
		
		BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
		buWriter.newLine(); 
		buWriter.append(texto1 + "\n" + texto2 + "\n" + texto3);
		buWriter.close();
		System.out.println("Professor registrado com sucesso!");
		
		
		
	}catch (IOException mensagemErro) {
		System.out.println("Erro ao registrar professor" + mensagemErro);
	
	}

}


public static void escreverNoArqCoord(String enderecoArquivo, coordenador cadcoord) {
	
	
	try {
		String texto1 = "Nome do coordenador: " + cadcoord.getNome();
		String texto2 = "Matricula do coordenador: " + cadcoord.getMatricula();
		String texto3 = "Gerente do coordenador: " + cadcoord.getGerencia();
		
		BufferedWriter buWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
		buWriter.newLine(); 
		buWriter.append(texto1 + "\n" + texto2 + "\n" + texto3);
		buWriter.close();
		System.out.println("Coordenador registrado com sucesso!");
		
		
		
	}catch (IOException mensagemErro) {
		System.out.println("Erro ao registrar coordenador" + mensagemErro);
	
	}

}

	

}
