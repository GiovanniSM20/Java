package controller;

public class Exercicios_20 {
	public static void main(String[] args){
		int x, i, z;
		z = 0;
		for(i = 0; i <= 50; i++){
			x = i % 5;
			if (x == 0){
				z = z + i;				
			}
		}
		System.out.println(z);
	}

}
