package Controller;

public class Ex03 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double sorteio = Math.random();
			int resultado = 0 + (int) (sorteio * 80);
			
			System.out.println("Os números sorteados foram " + resultado);
		}

	}

}
