package controller;
import util.Teclado;
public class Exercicios_02 {
	public static void main(String[] args){
		double Sm;
		double Sp;
		double X;
		Sm = Teclado.lerDouble("Digite o valor do sal�rio minimo.");
		Sp = Teclado.lerDouble("Digite o valor do seu sal�rio atual.");
		X =  Sp/Sm;
		System.out.println("Seu sal�rio tem: "+X +" sal�rios minimos");
	}

}
