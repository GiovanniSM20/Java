package controller;

public class Exercicios_18 {
	public static void main(String[] args){
		int i, x, n;
		i = 0;
		x = 0;
		n = 0;
		do{
			x = x + n;
			n = n + 1;
			i = i + 1;
		}while (i <= 50);
		System.out.println(x);
	}

}
