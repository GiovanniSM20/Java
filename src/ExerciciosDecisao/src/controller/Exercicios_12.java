package controller;
import util.Teclado;
public class Exercicios_12 {
	public static void main(String[] args){
		int n1, n2;
		n1 = Teclado.lerInt("Digite um número:");
		n2 = Teclado.lerInt("Digite um número:");
		if(n1 > n2){
			System.out.println("O " +n1 +" é o maior e " +n2 +" o menor");
		}else{
			if(n1<n2){
				System.out.println("O " +n1 +" é o menor e " +n2 +" o maior");
			}else{
				System.out.println("Os números são iguais");
			}
		}
	}

}
