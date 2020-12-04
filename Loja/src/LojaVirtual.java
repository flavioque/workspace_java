
public class LojaVirtual {

	public static void main(String args[]) {

		Produto p1 = new Produto();

		p1.codBarras = 1;
		p1.nome = "Diamange Negro";
		p1.preco = 3.5;
		p1.departamento = "Chocolates";

		System.out.println("**** Pre�o original ****");
		p1.mostrarProduto();

		System.out.println("**** Pre�o desc 10% ****");
		double d1 = p1.aplicarDesconto(10);
		System.out.printf ("Pre�o R$     : %.2f%n", d1);
		
		System.out.println("**** Pre�o desc 15% ****");
		double d2 = p1.aplicarDesconto(15);
		System.out.printf ("Pre�o R$     : %.2f%n", d2);

	}

}
