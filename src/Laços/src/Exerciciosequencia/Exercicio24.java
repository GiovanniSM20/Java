package Exerciciosequencia;

import util.Teclado;

public class Exercicio24 {

	public static void main(String[] args) {
		
		int num, soma = 0;
		do {
		num = Teclado.lerInt("Digite um número");
		if (num > 0) {
			soma += 1;
		} 
		} while(num > 0);
		System.out.println("Você digitou " + soma + " números positivos");
	
	}

}
