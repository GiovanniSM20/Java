package controller;

import util.Teclado;

public class Ex05 {

public static void main(String[] args) {
	int num[] = new int[5];
	int num1[] = new int[5];
		
	for (int i=0;i<5;i++) {
		num[i] = Teclado.lerInt("Digite um número");
		num1[i] = (int) Math.pow(num[i],2);
	}
	
	for (int i=0;i<5;i++){
		System.out.println(num[i] +"² = " + num1[i]);
	}
	
}
}
