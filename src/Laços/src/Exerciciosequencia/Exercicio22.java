package Exerciciosequencia;

import util.Teclado;

public class Exercicio22 {

	public static void main(String[] args) {
		
	int num, i = 0;
	num = Teclado.lerInt("Digite um número positivo para o limite");
	if (num > 0) {
	while (i <= num ){
	System.out.println(i);
	i++;} 
	} else {
		System.out.println("Seu número não é positivo");
	
	}

	}

}
