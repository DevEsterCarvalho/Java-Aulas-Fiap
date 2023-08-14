package br.com.fiap.tds;

public class OperadorAtribuicao {
	public static void main(String[] args) {
		int x = 25;
		x = x + 30; //mesma coisa que x += 30
		
		System.out.println(x);
		
		int y = 15;
		y *= 10; // mesma coisa que y = y * 10
		
		System.out.println(y);
	}
}
