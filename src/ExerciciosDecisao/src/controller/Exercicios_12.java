package controller;
import util.Teclado;
public class Exercicios_12 {
	public static void main(String[] args){
		int n1, n2;
		n1 = Teclado.lerInt("Digite um n�mero:");
		n2 = Teclado.lerInt("Digite um n�mero:");
		if(n1 > n2){
			System.out.println("O " +n1 +" � o maior e " +n2 +" o menor");
		}else{
			if(n1<n2){
				System.out.println("O " +n1 +" � o menor e " +n2 +" o maior");
			}else{
				System.out.println("Os n�meros s�o iguais");
			}
		}
	}

}
