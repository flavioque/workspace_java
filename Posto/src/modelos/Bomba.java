package modelos;

public class Bomba {
	private String Combustivel;
	private double QuantidadeAAbastecer;
	private double ValorUnitarioPorLitro;
	private double ValorAPagar;
		
	
	public Bomba(double valorUnitarioPorLitro, String combustivel) {
		super();
		ValorUnitarioPorLitro = valorUnitarioPorLitro;
		Combustivel  = combustivel;
	}

	public void AbastecerXLitros(double QuantidadeAAbastecer ) {		
		this.QuantidadeAAbastecer=QuantidadeAAbastecer;
		this.ValorAPagar = QuantidadeAAbastecer * ValorUnitarioPorLitro;
	}
	
	public void AbastecerXReais (double ValorAPagar) {		
		this.ValorAPagar = ValorAPagar;
		this.QuantidadeAAbastecer = ValorAPagar /this.ValorUnitarioPorLitro;
	}
	
	public String ExibirAbastecimento () {
		String texto = "******* Abastecimento *******\n";
		texto += "Combustível    : " + this.Combustivel + "\n";
		texto += "Valor Unitário : " + this.ValorUnitarioPorLitro+ "\n";
		texto += "Qtd Abastecida : " + this.QuantidadeAAbastecer + "\n";
		texto += "Valor Total    : " + this.ValorAPagar + "\n";
		return texto;
		
	}

}
