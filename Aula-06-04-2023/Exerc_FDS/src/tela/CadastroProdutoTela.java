package tela;

import javax.swing.JOptionPane;

import entidades.equipamento;
import entidades.furadeira;
import entidades.makita;

public class CadastroProdutoTela {
	
	
	// Tela da classe equipamento
	
	public equipamento cadastrarEquipamento(equipamento equipamentoParametro) {
		
		equipamentoParametro.setCodigo(JOptionPane.showInputDialog("Digite o codigo: "));
		equipamentoParametro.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
		equipamentoParametro.setprecoDeCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de compra: ")));
		equipamentoParametro.setprecoDeVenda(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda: ")));
		
		return equipamentoParametro;
		
	}
	
	
	public void mostrarEquipamento(equipamento equipamentoParametro) {
		
		JOptionPane.showMessageDialog(null, "Código: " + equipamentoParametro.getCodigo());
		JOptionPane.showMessageDialog(null, "Marca: " + equipamentoParametro.getMarca());
		JOptionPane.showMessageDialog(null, "Preço de compra: " + equipamentoParametro.getprecoDeCompra());
		JOptionPane.showMessageDialog(null, "Preço de venda: "+ equipamentoParametro.getprecoDeVenda());
		
	}
	
	
	// Tela da classe furadeira
	

	public furadeira cadastrarFuradeira(furadeira furadeiraParametro) {
		
		furadeiraParametro.settipoBroca(JOptionPane.showInputDialog("Digite o tipo de broca: "));
		
		return furadeiraParametro;
	}
	
	public void mostrarFuradeira(furadeira furadeiraParametro) {
		
		JOptionPane.showMessageDialog(null, furadeiraParametro.gettipoBroca());
		
	}	
	
	
	// Tela da classe makita
	
	public makita cadastrarMakita(makita makitaParametro) {
		
		makitaParametro.settipoMakita(JOptionPane.showInputDialog("Digite o tipo de makita: "));
		
		return makitaParametro;
	}
	
	public void mostrarMakita(makita makitaParametro) {
		
		JOptionPane.showMessageDialog(null, makitaParametro.gettipoMakita());
		
	}	
	

}
