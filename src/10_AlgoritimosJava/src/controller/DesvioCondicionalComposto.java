package controller;
import util.Teclado;
public class DesvioCondicionalComposto {
	public static void main(String[] args){
		int a, b, x;
		a = Teclado.lerInt("Informe o primeiro número:");
		b = Teclado.lerInt("Informe o segundo número:");
		x = a + b;
		if (x >= 10){
			System.out.println("O resultado acrescido de 5 é " +(x + 5));
		}else{
			System.out.println("O resultado subtraido de 7 é "+(x - 7));
		}
	}

}
