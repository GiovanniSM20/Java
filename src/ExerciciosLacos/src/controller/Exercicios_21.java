package controller;
import util.Teclado;
public class Exercicios_21 {
	public static void main(String[] args){
		int i, x;
		x = 1;
		while(x <= 10){
			i = Teclado.lerInt("Informe sua idade: ");
			if(i < 18){
				System.out.println("Você é menor de idade");
			}else{
				System.out.println("Você é maior de idade");
			}
			x = x + 1;
		}
	}

}
