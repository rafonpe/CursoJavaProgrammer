package principal;

import servicos.tela;
import servicos.manipulaArquivo;

public class principal {

	public static void main(String[] args) {
		
		int escolha_menu;
		String path1 = "C:\\Users\\Ricardo\\Desktop\\Curso_Java\\Repositorio_Git_Meu\\CursoJavaProgrammer\\Aula-12-04-2023\\Cadastro\\Cadastro_aluno.txt";
		String path2 = "C:\\Users\\Ricardo\\Desktop\\Curso_Java\\Repositorio_Git_Meu\\CursoJavaProgrammer\\Aula-12-04-2023\\Cadastro\\Cadastro_professor.txt";
		String path3 = "C:\\Users\\Ricardo\\Desktop\\Curso_Java\\Repositorio_Git_Meu\\CursoJavaProgrammer\\Aula-12-04-2023\\Cadastro\\Cadastro_coordenador.txt";
		tela t1 = new tela();
		
		escolha_menu = t1.menu();
		
		if (escolha_menu == 1) {
			manipulaArquivo arq = new manipulaArquivo();
			arq.escreverNoArqAluno(path1, t1.cadastrarAluno());
		}
		else if (escolha_menu == 2) {
			
			manipulaArquivo arq = new manipulaArquivo();
			arq.escreverNoArqProf(path2, t1.cadastrarProfessor());
			
		} else {
			
			manipulaArquivo arq = new manipulaArquivo();
			arq.escreverNoArqCoord(path3, t1.cadastrarCoordenador());
			
		}
		

	}

}
