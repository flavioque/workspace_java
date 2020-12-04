package Modelos;

public class Conta {
	private int Agencia;
	private int Conta;
	private String Titular;
	private String CPF;
	private double Saldo;
	
	
	
	public Conta(double saldo) {
		super();
		this.Saldo = saldo;
	}

	public void Depositar (double Valor) {
		this.Saldo += Valor;
	}
	
	public boolean Transferir (Conta Conta, double Valor) {
		if (this.Sacar(Valor) == true) {
			Conta.Depositar(Valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean Sacar (double Valor) {
		if ((this.Saldo - Valor)>=0) {
			this.Saldo -= Valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getConta() {
		return Conta;
	}

	public void setConta(int conta) {
		Conta = conta;
	}

	public String MotrarDadosdaConta(){
		String texto = "********** Dados da Conta **********\n";
		texto += "Agência     : " + this.Agencia + "\n"; 
		texto += "Conta       : " + this.Conta + "\n";
		texto += "Titular     : " + this.Titular + "\n";
		texto += "CPF         : " + this.CPF + "\n";
		texto += "Saldo       : " + this.Saldo + "\n";
		texto += "***************************\n";
		return texto;
	}
	
	public int getAgencia() {
		return Agencia;
	}
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public double getSaldo() {
		return Saldo;
	}
	
	
}
