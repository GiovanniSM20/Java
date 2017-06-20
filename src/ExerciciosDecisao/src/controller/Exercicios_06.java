package controller;
import util.Teclado;
public class Exercicios_06 {
	public static void main(String[] args){
		int N;
		N = Teclado.lerInt("Digite um número:");
		if (N > 1000){
			System.out.println("O número informado é maior que 1000");
		}else{
			System.out.println("O número informado é menor que 1000");	
		}
	}

}
