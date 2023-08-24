package br.com.fiap.banco;

public class Conta {
	int numero;
	double saldo;
	int agencia;
	
	public Conta(){	
	}
	
	public Conta (int numero, double saldo, int agencia) {
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
	}
	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	public double verificarSaldo(){
		return saldo;
	}
}
