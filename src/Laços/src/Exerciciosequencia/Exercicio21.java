package Exerciciosequencia;

import util.Teclado;

public class Exercicio21 {

public static void main(String[] args) {
		
		int i, idade, total = 0;

		for (i = 0; i<= 10; i++) {
			idade = Teclado.lerInt("Digite sua idade");
			if (idade < 18) {
				total += 1;
			}
		}
		System.out.println(total + " pessoas são menores.");

	}

}