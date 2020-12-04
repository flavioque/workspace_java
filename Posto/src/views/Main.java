package views;

import modelos.Bomba;

public class Main {
	
	public static void main(String args[]) {
		
		Bomba b1 = new Bomba(3.00, "�lcool");
		
		System.out.println("***** Sem nenhum abastecimento ******");
		System.out.println(b1.ExibirAbastecimento());
		
		System.out.println("***** 1o abastecimento X Litros******");
		b1.AbastecerXLitros(2);
		System.out.println(b1.ExibirAbastecimento());
		
		System.out.println("***** 2o abastecimento X Reais ******");
		b1.AbastecerXReais(9);
		System.out.println(b1.ExibirAbastecimento());
		
		
		Bomba b2 = new Bomba(4.50, "Gasolina");
		
		System.out.println("***** Sem nenhum abastecimento ******");
		System.out.println(b2.ExibirAbastecimento());
		
		System.out.println("***** 1o abastecimento X Litros******");
		b2.AbastecerXLitros(2);
		System.out.println(b2.ExibirAbastecimento());
		
		System.out.println("***** 2o abastecimento X Reais ******");
		b2.AbastecerXReais(13.5);
		System.out.println(b2.ExibirAbastecimento());
		
	}

}
