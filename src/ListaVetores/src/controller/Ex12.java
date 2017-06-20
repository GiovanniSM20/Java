package controller;
import util.Teclado;
public class Ex12 {
	public static void main(String[] args){
		int a [] = new int [5];
		int b [] = new int [5];
		
		for (int i=0;i<5;i++){
			a[i]=Teclado.lerInt("Digite um número");
			b[i]=Teclado.lerInt("Digite um número");
		}
		for (int i=0;i<5;i++){
			for (int j=0;j<5;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]+"Existe nos dois vetores");
				}
			}
			
		}
	}

}
