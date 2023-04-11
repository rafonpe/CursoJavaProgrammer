package tela;

import javax.swing.JOptionPane;

import entidades.equipamento;
import entidades.furadeira;
import entidades.makita;

public class CadastroProdutoTela {
	
	
	// Tela da classe equipamento
	
	
	public equipamento cadastrarEquipamento(equipamento equipamentoParametro) {
		
		equipamentoParametro.setTipo(Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para furadeira ou 2 para makita: ")));
		return equipamentoParametro;
		
	}
	
	/*
	public void mostrarEquipamento(equipamento equipamentoParametro) {
		
		JOptionPane.showMessageDialog(null, equipamentoParametro.getTipo());
		
	} 
	*/
	
	
	// Tela da classe furadeira
	

	public furadeira cadastrarFuradeira(furadeira furadeiraParametro) {
		
		furadeiraParametro.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
		furadeiraParametro.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		furadeiraParametro.settipoBroca(JOptionPane.showInputDialog("Digite o tipo de broca: "));
		furadeiraParametro.setprecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra: ")));
		furadeiraParametro.setprecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda: ")));
		
		return furadeiraParametro;
	}
	
	public void mostrarFuradeira(furadeira furadeiraParametro) {
		
		
		JOptionPane.showMessageDialog(null, "Código: " + furadeiraParametro.getCodigo());
		JOptionPane.showMessageDialog(null, "Marca: " + furadeiraParametro.getMarca());
		JOptionPane.showMessageDialog(null, "Tipo Broca: " + furadeiraParametro.gettipoBroca());
		JOptionPane.showMessageDialog(null, "Preço de compra: " + furadeiraParametro.getprecoDeCompra());
		JOptionPane.showMessageDialog(null, "Preço de venda: "+ furadeiraParametro.getprecoDeVenda());
		
	}	
	
	
	// Tela da classe makita
	
	public makita cadastrarMakita(makita makitaParametro) {
		
		makitaParametro.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
		makitaParametro.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		makitaParametro.settipoMakita(JOptionPane.showInputDialog("Digite o tipo de makita: "));
		makitaParametro.setprecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra: ")));
		makitaParametro.setprecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda: ")));
		
		return makitaParametro;
	}
	
	public void mostrarMakita(makita makitaParametro) {
		
		JOptionPane.showMessageDialog(null, "Código: " + makitaParametro.getCodigo());
		JOptionPane.showMessageDialog(null, "Marca: " + makitaParametro.getMarca());
		JOptionPane.showMessageDialog(null, "Tipo makita: " + makitaParametro.gettipoMakita());
		JOptionPane.showMessageDialog(null, "Preço de compra: " + makitaParametro.getprecoDeCompra());
		JOptionPane.showMessageDialog(null, "Preço de venda: "+ makitaParametro.getprecoDeVenda());
		
	}	
	

}
