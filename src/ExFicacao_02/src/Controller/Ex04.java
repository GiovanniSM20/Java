package Controller;

public class Ex04 {

	public static void main(String[] args) {
		
		double sorteio = Math.random();
		int resultado = 0 + (int) (sorteio * 100);
		
		double sorteio2 = Math.random();
		int resultado2 = 0 + (int) (sorteio * 100);
		
		int maior = Math.max(resultado,resultado2);
		
		System.out.println("N�meros sorteados: " + resultado + " e " + resultado2);
		System.out.println("O maior n�mero entre os dois �: " + maior);

	}

}
