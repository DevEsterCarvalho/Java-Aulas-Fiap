package br.com.fiap.banco;

public class Teste {
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		double valor = cc.saldo;
		//System.out.println(cc.saldo);
		cc.saldo = 50;
		cc.agencia = 123;
		cc.numero = 1000;
		
		cc.depositar(100);
		
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(100,200,1000);
		poupanca.retirar(150);
		System.out.println(poupanca.verificarSaldo());
		
	}
}
