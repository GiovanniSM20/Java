package controller;
import util.Teclado;
public class Exercicios_22 {
	public static void main(String[] args){
		int i, x;
		x = Teclado.lerInt("Informe um número positivo");
		i = 1;
		do{
			System.out.println(i);
			i = i + 1;
		}while(i <= x);
	}

}
