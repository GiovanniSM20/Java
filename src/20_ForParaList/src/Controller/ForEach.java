package controller;
import util.Teclado;

public class ForEach {
	public static void main(String[] args) {
		int[] numero = new int[5];
		int soma = 0;
		
		for (int cont = 0; cont< numero.length; cont++) {
			numero[cont] = Teclado.lerInt("Digite um n�mero inteiro: ");
		}
		
		for (int cont: numero) {
			soma += cont;
		}
		
		System.out.println("A soma dos n�meros que voc� digitou �: " + soma);
	}

}
