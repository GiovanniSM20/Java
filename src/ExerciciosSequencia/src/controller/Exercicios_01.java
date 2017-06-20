package controller;
import util.Teclado;
public class Exercicios_01 {
	public static void main(String[] args){
		double N;
		double D;
		double ND;
		N = Teclado.lerDouble("Digite um numerador para tranformalo em número decimal");
		D = Teclado.lerDouble("Digite um denominador que seja 10, 100, 1000 e assim por diante");
		ND = N/D;
		System.out.println("O número decimal é:" +ND);
	}

}
