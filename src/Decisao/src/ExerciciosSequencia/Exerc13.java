package ExerciciosSequencia;

import util.Teclado;

public class Exerc13 {

	public static void main(String[] args) {
		
		int n1,n2,n3, maior;
		
		n1 = Teclado.lerInt("Informe o primeiro número");
		n2 = Teclado.lerInt("Informe o segundo número");
		n3 = Teclado.lerInt("Informe o terceiro número");
		
		maior = n1;
		
		if (maior < n2) {
			maior = n2;
			
		}
		if (maior < n3) {
			maior = n3;
		}
		
		System.out.println("O maior valor inserido é " + maior);
			

	}

}
