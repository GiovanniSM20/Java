package controller;
import util.Teclado;
public class Exercicios_05 {
	public static void main(String[] args){
		int numero, a, b, c;
		numero = Teclado.lerInt("Digite um n�mero de 3 algarismos");
		a = numero / 100;
		b = (numero % 100) / 10;
		c = (numero % 100) % 10;
		
		System.out.println("O n�mero invertido � "+c +b +a);
	}

}
