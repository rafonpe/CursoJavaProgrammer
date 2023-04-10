package entidades;

public class servico {
	
	
	// Retorna o lucro
	public double calcularLucro(double precoCompra, double precoVenda) {
		
		double lucro;
		lucro = precoVenda - precoCompra;
		
		return lucro;
		
	}
	
	

}
