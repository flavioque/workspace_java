package View;

import javax.swing.JOptionPane;

import Modelos.Conta;


public class Main {

	public static void main (String args[]) {
		
		Conta c1 = new Conta(100.00);
		
		c1.setAgencia(1);
		c1.setConta(1);
		c1.setCPF("174.492.448-10");
		c1.setTitular("Fl�vio Queiroz");
		
		//System.out.Jop("***** Saldo na abertura da conta *****");
		JOptionPane.showMessageDialog(null, "***** Saldo na abertura da conta *****");
		System.out.println(c1.MotrarDadosdaConta());
		
		c1.Depositar(100.00);
		System.out.println("***** Saldo ap�s depositar R$ 100,00 *******");
		System.out.println(c1.MotrarDadosdaConta());
		
		if (c1.Sacar(50.0) == true) {
			System.out.println("***** Saldo ap�s sacar R$ 50,00 *******");
			System.out.println(c1.MotrarDadosdaConta());
		}
		
		System.out.println("***** Tentativa de sacar R$ 300,00 *******");
		if (c1.Sacar(300.0) == false) {			
			System.out.println("N�o foi poss�vel sacar R$ 300,00 devido saldo insuficiente");			
		}
		System.out.println(c1.MotrarDadosdaConta());
		
		System.out.println("***** Tentativa de transferir o Saldo Existe para uma nova Conta *******");
		Conta c2 = new Conta(0);
		c2.setAgencia(1);
		c2.setConta(2);
		c2.setCPF("123.456.789-10");
		c2.setTitular("Professor Isidro");				
		if (c1.Transferir(c2, c1.getSaldo())==true) {
			System.out.println("Transfer�ncia realizada com sucesso! ");
			System.out.println(c1.MotrarDadosdaConta());
			System.out.println(c2.MotrarDadosdaConta());
		}
		else {
			System.out.println("Transfer�ncia N�O realizada! ");
			System.out.println(c1.MotrarDadosdaConta());
			System.out.println(c2.MotrarDadosdaConta());
		}
		
		
		
		
	}
}
