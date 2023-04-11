package cadastroEquipamento;

import javax.swing.JOptionPane;

import entidades.equipamento;
import entidades.furadeira;
import entidades.makita;
import entidades.servico;
import tela.CadastroProdutoTela;

public class principal {

	public static void main(String[] args) {
		
		int escolha;
		double lucro;
		CadastroProdutoTela caProdutoTela = new CadastroProdutoTela();
		servico seLucro = new servico();
		equipamento equipamentoVazio = new equipamento();
		equipamento equipamentoPreenchido = new equipamento();
		equipamentoPreenchido = caProdutoTela.cadastrarEquipamento(equipamentoVazio);
		escolha = equipamentoPreenchido.getTipo();
	
		if (escolha == 1) {
		
		// Caso o produto selecionado for furadeira
		furadeira furadeiraVazia = new furadeira();
		furadeira furadeiraPreenchida = new furadeira();
		furadeiraPreenchida = caProdutoTela.cadastrarFuradeira(furadeiraVazia);
		caProdutoTela.mostrarFuradeira(furadeiraPreenchida);
		lucro = seLucro.calcularLucro(furadeiraPreenchida.getprecoDeCompra(), furadeiraPreenchida.getprecoDeVenda());
		JOptionPane.showMessageDialog(null, "Lucro recebido: " + lucro);
		
		}
		
		if (escolha == 2) {
		
		// Caso o produto selecionado for makita
		makita makitaVazia = new makita();
		makita makitaPreenchida = new makita();
		makitaPreenchida = caProdutoTela.cadastrarMakita(makitaVazia);
		caProdutoTela.mostrarMakita(makitaPreenchida);
		lucro = seLucro.calcularLucro(makitaPreenchida.getprecoDeCompra(), makitaPreenchida.getprecoDeVenda());
		JOptionPane.showMessageDialog(null, "Lucro recebido: " + lucro);
		
		}

		

	}

}
