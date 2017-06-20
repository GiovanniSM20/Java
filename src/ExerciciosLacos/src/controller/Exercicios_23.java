package controller;
import util.Teclado;
public class Exercicios_23 {
	public static void main(String[] args){
		int i, x, c;
		double m;
		c = 1;
		x = 0;
		while(c <=20 ){
			i = Teclado.lerInt("Infome vinte números: ");
			x = x + i;
			c = c +1;
		}
		m = x / 20;
		System.out.println("A média dos números informados é " +m);
	}

}
