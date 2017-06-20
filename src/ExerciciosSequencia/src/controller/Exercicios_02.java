package controller;
import util.Teclado;
public class Exercicios_02 {
	public static void main(String[] args){
		double Sm;
		double Sp;
		double X;
		Sm = Teclado.lerDouble("Digite o valor do salário minimo.");
		Sp = Teclado.lerDouble("Digite o valor do seu salário atual.");
		X =  Sp/Sm;
		System.out.println("Seu salário tem: "+X +" salários minimos");
	}

}
