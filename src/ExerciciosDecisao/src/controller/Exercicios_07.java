package controller;
import util.Teclado;
public class Exercicios_07 {
	public static void main(String[] args){
		int N;
		N = Teclado.lerInt("Digite um n�mero");
			if (N > 5000){
				System.out.println("O n�mero informado � maior que 5000");
			}else{
				if (N > 1000){
					System.out.println("O n�mero informado � entre 1000 e 5000");
				}else{
					System.out.println("O n�mero informado � menor que 1000");
				}
			}
		}
	}


