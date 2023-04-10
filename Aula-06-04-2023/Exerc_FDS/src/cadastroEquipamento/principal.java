package cadastroEquipamento;

import javax.swing.JOptionPane;

import entidades.equipamento;
import entidades.furadeira;
import entidades.makita;
import entidades.servico;
import tela.CadastroProdutoTela;

public class principal {

	public static void main(String[] args) {
		
		double lucro;


		// Declara e inicializa o objeto do Tipo equipamento que vai ser enviado para o metodo
		equipamento equipamentoEnviadoMetodo = new equipamento();
		
		// Declara e inicializa o objeto do Tipo equipamento que vai receber o resultado metodo
		equipamento equipamentoRecebidoMetodo = new equipamento();
		
		// Declara e iniciliza o objeto CadastroProdutoTela
		CadastroProdutoTela caProdutoTela = new CadastroProdutoTela();
		
		// Cadastrar e mostrar o equipamento 
		equipamentoRecebidoMetodo = caProdutoTela.cadastrarEquipamento(equipamentoEnviadoMetodo);
		caProdutoTela.mostrarEquipamento(equipamentoRecebidoMetodo);
		
		// Declara e inicializa o objeto servico
		servico seLucro = new servico();
		lucro = seLucro.calcularLucro(equipamentoRecebidoMetodo.getprecoDeCompra(), equipamentoRecebidoMetodo.getprecoDeVenda());
		JOptionPane.showMessageDialog(null, "Lucro recebido: " + lucro);
		
		
		
		

	}

}
