
public class Empregado {
	
	String nome;
	String cargo;
	double salario;
	
	void Imprimir () {
		System.out.println("Empregado : " + nome);
		System.out.println("Cargo     : " + cargo);
		System.out.printf("Salário R$ %.2f%n", salario);
	}

	void aumentarSalario (double percentual) {
		salario += salario * percentual/100;
	}
}
