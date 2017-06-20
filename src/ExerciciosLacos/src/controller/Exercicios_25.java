package controller;

public class Exercicios_25 {
	public static void main(String[] args){
		double c, j;
		int i;
		c = 1.50;
		i = 0;
		for(j = 1.10; j < c; j+=0.03){
			c = c + 0.02;
			i+=1;
		}
		System.out.println(i);
	}

}
