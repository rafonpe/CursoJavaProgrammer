package servico;

public class SalarioServico {
	
	// Retorna o salario Bruto
	public double calcularSalBruto(int qtdHorasTrabalhadas, double valorHorasTrabalhadas) {
		
		double salarioTemp;
		salarioTemp = valorHorasTrabalhadas * qtdHorasTrabalhadas;
		
		return salarioTemp;
	}
	
	
	//Retorna o salario liquido
	public double calcularSalLiquido(double salBruto, double descontoIr){
		
		double salLiquido;
		double valorDesconto = (descontoIr * salBruto)/100;
		salLiquido = salBruto - valorDesconto;
		
		return salLiquido;
	}
	
	//Calcula o salario com bonus	
	public double calcularSalBonus(double salBruto) {
		
		double salBonus;
		salBonus = salBruto + ((salBruto * 25)/100);
		return salBonus;
		
	}

}
