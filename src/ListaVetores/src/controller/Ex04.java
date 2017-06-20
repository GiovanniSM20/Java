package controller;

import util.Teclado;

public class Ex04 {

	public static void main(String[] args) {
		int num[] = new int[8];
		int num2[] = new int [8];
		
		for(int i=0; i<8; i++){
			num[i]=Teclado.lerInt("Digite um número");
			num2[i] = num[i] * 3;
		}
		
		for (int i=0;i<8;i++)
			System.out.println(num[i]+ " * 3 = " + num2[i]);  
	}

}
