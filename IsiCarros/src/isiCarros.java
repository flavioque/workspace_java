
public class isiCarros {
	
	public static void main (String args[]) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.marca = "Porche";
		c1.modelo = "kaieny";
		c1.cor = "Azul marinho nervoso";
		c1.ano = 2020;
		c1.preco = 125000.00;
		c1.imprimir();
		
		c2.marca = "Xevrole";
		c2.modelo = "Corsa";
		c2.cor = "Prata com detalhes brancos";
		c2.ano = 1998;
		c2.preco = 3852.00;
		c2.imprimir();
		
		
	}

}
