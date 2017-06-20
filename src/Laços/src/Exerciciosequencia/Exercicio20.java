package Exerciciosequencia;

public class Exercicio20 {

	public static void main(String[] args) {
		 
		int i = 0, soma = 0;
		do {
			if (i%5 == 0) {
				soma +=i;
			}i++; 
			}
		
		while (i <=50);
		System.out.println("O somatório dos múltiplos de 5 entre 0 e 50 é " + soma);
	}

}
