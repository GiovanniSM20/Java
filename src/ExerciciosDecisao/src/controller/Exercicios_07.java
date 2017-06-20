package controller;
import util.Teclado;
public class Exercicios_07 {
	public static void main(String[] args){
		int N;
		N = Teclado.lerInt("Digite um número");
			if (N > 5000){
				System.out.println("O número informado é maior que 5000");
			}else{
				if (N > 1000){
					System.out.println("O número informado é entre 1000 e 5000");
				}else{
					System.out.println("O número informado é menor que 1000");
				}
			}
		}
	}


