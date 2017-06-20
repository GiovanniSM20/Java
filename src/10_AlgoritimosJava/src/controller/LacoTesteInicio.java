package controller;
import util.Teclado;
public class LacoTesteInicio {
	public static void main(String[] args){
		int r, x, i;
		i = 1;
		while(i <= 5){
			x = Teclado.lerInt("Digite um número: ");
			r = x * 3;
			System.out.println(r);
			i = i +1;
		}
	}

}
