package controller;

import util.Teclado;

public class Ex03 {

	public static void main(String[] args) {
		int num[] = new int[5];
		int soma=0;
		for (int i=0;i<5;i++){
			num[i]=Teclado.lerInt("Digite um n�mero");
			if(num[i]%2 != 0){
				soma += num[i];
			}
		}
		System.out.println("O somat�rio dos impares � " + soma);
	}
}