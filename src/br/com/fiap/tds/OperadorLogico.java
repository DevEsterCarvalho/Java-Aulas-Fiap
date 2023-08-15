package br.com.fiap.tds;

public class OperadorLogico {
	public static void main(String[] args) {
		
		//testando operador lógico && and 
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar);
		
		//testando operador lógico || or
		int nrAmarelo = 2, nrVermelho = 1; 
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);
		
		//testando operador lógico ^ xor
		int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);
		
		//testando operador lógico ! not
		int nIdade = 20;
		boolean maiorIdade = !(nIdade >= 18);
		System.out.println(maiorIdade);
	}
}
