package controller;

import util.Teclado;

public class Ex03 {

	public static void main(String[] args) {
		int num[] = new int[5];
		int soma=0;
		for (int i=0;i<5;i++){
			num[i]=Teclado.lerInt("Digite um número");
			if(num[i]%2 != 0){
				soma += num[i];
			}
		}
		System.out.println("O somatório dos impares é " + soma);
	}
}