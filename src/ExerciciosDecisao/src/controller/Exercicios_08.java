package controller;
import 	util.Teclado;
public class Exercicios_08 {
	public static void main (String[] args){
		int X;
		X = Teclado.lerInt("Informe um n�mero: ");
		if(X < 1000){
			System.out.println("O n�mero � menor que 1000.");
	}else{
		if (X < 5000){
			System.out.println("O n�mero est� entre 1000 e 5000.");
		}else{
			if (X < 8000){
			 System.out.println("O n�mero est� entre 5000 e 8000  ");
			}else{
				System.out.println("� maior que 8000.");
				
			}
			
		}
		}
	}
}
