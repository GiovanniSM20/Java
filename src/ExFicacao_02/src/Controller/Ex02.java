package Controller;

import Util.Teclado;

public class Ex02 {

	public static void main(String[] args) {
		double angulo, sen,cos,tan;
		angulo = Teclado.lerDouble("Digite um �ngulo: ");
		
		sen = Math.sin(Math.toRadians(angulo));
		cos = Math.cos(Math.toRadians(angulo));
		tan = Math.tan(Math.toRadians(angulo));
		
		System.out.println("O seno � " + sen + ", o cosseno � " + cos + ", e o tangente � " + tan + ".");

	}

}
