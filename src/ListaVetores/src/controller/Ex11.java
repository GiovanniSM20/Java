package controller;
import util.Teclado;
public class Ex11 {

	public static void main(String[] args) {
		int n [] = new int[10];
		int maior=0, menor=0, soma=0;
		double media;
		for (int i = 0; i < 10; i++){
			n[i] = Teclado.lerInt("Digite um número");
			soma+=n[i];
		}
		maior = n[0];
		menor = n[0];
		for (int i=0;i<10;i++){
			if(maior<n[i]){
				maior=n[i];
			}
			if(menor>n[i]){
				menor=n[i];
			}
		}
		media=soma/10;
		System.out.println("A média é: "+media+" O maior número é: "+maior+" O menor número é: "+menor);

	}

}
