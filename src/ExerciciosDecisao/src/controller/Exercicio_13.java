package controller;
import util.Teclado;
public class Exercicio_13 {
	public static void main(String[] args){
		int n1, n2 , n3, maior;
		n1 = Teclado.lerInt("Digite um número:");
		n2 = Teclado.lerInt("Digite um número:");
		n3 = Teclado.lerInt("Digite um número:");
		if(n1 > n2){
			
			if(n1 > n3){
				maior = n1;
				System.out.println("O " +n1 +" é o maior número");
			}else{
				maior = n3;
				System.out.println("O " +n3 +" é o maior número");
			}
		}else{
			if(n2 > n3){
				maior = n2;
				System.out.println("O " +n2 +" é o maior número");
			}else{
				maior = 3;
				System.out.println("O " +n3 +" é o maior número");
			}
		}
	}
}		

		
	


