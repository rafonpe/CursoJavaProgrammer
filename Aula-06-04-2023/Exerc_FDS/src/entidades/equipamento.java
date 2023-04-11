package entidades;

public class equipamento {
	
	 private int tipo;
	 private String codigo;
	 private String marca;
	 private Double precoDeCompra;
	 private Double precoDeVenda;
	 private Double lucro;
	 
	public String getCodigo() {
			return codigo;
		}
	
	public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}	
	
	public Double getprecoDeCompra() {
		return precoDeCompra;
	}

	public void setprecoDeCompra(Double precoDeCompra) {
		this.precoDeCompra = precoDeCompra;
	}	
	
	public Double getprecoDeVenda() {
		return precoDeVenda;
	}

	public void setprecoDeVenda(Double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}	
	
	public Double getlucro() {
		return lucro;
	}

	public void setlucro(Double lucro) {
		this.lucro = lucro;
	}
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
