package controller;
import util.Teclado;
public class DesvioCondicionalSimples {
	public static void main(String[] args){
		int a, b, x;
		a = Teclado.lerInt("Informe o primeiro número:");
		b = Teclado.lerInt("Informe o segundo número:");
		x = a + b;
		if (x > 10){
			System.out.println("O valor da some é "+x);
		}
	}

}
