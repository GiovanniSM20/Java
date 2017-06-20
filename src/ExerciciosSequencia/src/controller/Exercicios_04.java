package controller;
import util.Teclado;
public class Exercicios_04 {
	public static void main(String[] args) {
		double V;
		double D;
		double Vd;
		V = Teclado.lerDouble("Digite o valor do produto: ");
		D = Teclado.lerDouble("Digite o valor do desconto dado: ");
		Vd = (V * D) - V;
		System.out.println("O valor do produto é R$" +Vd);
	}

}
