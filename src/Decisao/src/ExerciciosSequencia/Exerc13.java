package ExerciciosSequencia;

import util.Teclado;

public class Exerc13 {

	public static void main(String[] args) {
		
		int n1,n2,n3, maior;
		
		n1 = Teclado.lerInt("Informe o primeiro n�mero");
		n2 = Teclado.lerInt("Informe o segundo n�mero");
		n3 = Teclado.lerInt("Informe o terceiro n�mero");
		
		maior = n1;
		
		if (maior < n2) {
			maior = n2;
			
		}
		if (maior < n3) {
			maior = n3;
		}
		
		System.out.println("O maior valor inserido � " + maior);
			

	}

}
