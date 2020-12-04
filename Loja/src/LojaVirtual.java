
public class LojaVirtual {

	public static void main(String args[]) {

		Produto p1 = new Produto();

		p1.codBarras = 1;
		p1.nome = "Diamange Negro";
		p1.preco = 3.5;
		p1.departamento = "Chocolates";

		System.out.println("**** Preço original ****");
		p1.mostrarProduto();

		System.out.println("**** Preço desc 10% ****");
		double d1 = p1.aplicarDesconto(10);
		System.out.printf ("Preço R$     : %.2f%n", d1);
		
		System.out.println("**** Preço desc 15% ****");
		double d2 = p1.aplicarDesconto(15);
		System.out.printf ("Preço R$     : %.2f%n", d2);

	}

}
