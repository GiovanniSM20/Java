package controller;
import util.Teclado;
public class Ex_1Q9 {
	public static void main(String[] args){
		try{
		String frase;
		frase = Teclado.lerTexto("Digite uma frase que seja importante em sua vida.");
		
		String palavra1;
		palavra1 = frase.substring(0, frase.indexOf(' '));
		System.out.println(palavra1);
		
		String mai;
		mai = frase.toUpperCase();
		System.out.println(mai);
		
		String min;
		min = frase.toLowerCase();
		System.out.println(min);
		
		String x;
		x = frase.substring(10, 18);
		System.out.println(x);
		
		String y;
		y = frase.substring(25);
		System.out.println(y);
		}catch(StringIndexOutOfBoundsException x){
			System.out.println("Erro: n�mero de caracteres menor do que necess�rio");
			main(args);
		}
		
	}

}
