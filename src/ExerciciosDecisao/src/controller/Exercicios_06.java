package controller;
import util.Teclado;
public class Exercicios_06 {
	public static void main(String[] args){
		int N;
		N = Teclado.lerInt("Digite um n�mero:");
		if (N > 1000){
			System.out.println("O n�mero informado � maior que 1000");
		}else{
			System.out.println("O n�mero informado � menor que 1000");	
		}
	}

}
