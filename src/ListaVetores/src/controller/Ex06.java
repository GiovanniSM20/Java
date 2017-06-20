package controller;

import util.Teclado;

public class Ex06 {

public static void main(String[] args) {
		int J;
		int A[] = new int[20];
		int B[] = new int[20];
		for (int i=0;i<20;i++){
			A[i] = Teclado.lerInt("Informe um Número:");
		}
		J = 19;
		for (int i=0;i<20;i++) {
			B[i]=A[J];
			J--;
		}
		System.out.println("Veja abaixo o conteúdo do vetor A:");
		for (int i=0;i<20;i++) {
			System.out.println(A[i] + " ");
		}
		System.out.println("Veja abaixo o conteúdo do vertor B:");
		for (int i=0;i<20;i++) {
			System.out.println(B[i] + " ");
		}
	}

}
