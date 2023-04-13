package servicos;

import javax.swing.JOptionPane;
import cadastro.aluno;
import cadastro.professor;
import cadastro.coordenador;

public class tela {
	
	
	public int menu() {
		
	    int opcao = (Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar aluno, 2 - Cadastrar professor, 3 - Cadastrar coordenador: ")));
		return opcao;
		
	}
	
	public aluno cadastrarAluno() {
		
		aluno al = new aluno();
		
		al.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
		al.setMatricula(JOptionPane.showInputDialog("Digite a matricula do aluno: "));
		al.setTurma(JOptionPane.showInputDialog("Digite a turma do aluno: "));
		
		return al;
	}
	
	public professor cadastrarProfessor() {
		
		professor prof = new professor();
		
		prof.setNome(JOptionPane.showInputDialog("Digite o nome do professor: "));
		prof.setMatricula(JOptionPane.showInputDialog("Digite a matricula do professor: "));
		prof.setDisciplina(JOptionPane.showInputDialog("Digite a disciplina do professor: "));
		
		return prof;
	}
	
	public coordenador cadastrarCoordenador() {
		
		coordenador coord = new coordenador();
		
		coord.setNome(JOptionPane.showInputDialog("Digite o nome do coordenador: "));
		coord.setMatricula(JOptionPane.showInputDialog("Digite a matricula do coordenador: "));
		coord.setGerencia(JOptionPane.showInputDialog("Digite o nome do gerente: "));
		
		return coord;
	}
	
	

}
