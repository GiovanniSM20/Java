package Exerciciosequencia;

import util.Teclado;

public class Exercicio22 {

	public static void main(String[] args) {
		
	int num, i = 0;
	num = Teclado.lerInt("Digite um n�mero positivo para o limite");
	if (num > 0) {
	while (i <= num ){
	System.out.println(i);
	i++;} 
	} else {
		System.out.println("Seu n�mero n�o � positivo");
	
	}

	}

}
