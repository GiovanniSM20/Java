package controller;
import util.Teclado;
public class Ex14 {

	public static void main(String[] args) {
		int a [] = new int [15];
		int b [] = new int [15];
		int f = 1;
		for(int i=0;i<15;i++){
			a[i]=Teclado.lerInt("Digite o " +(i+i)+" � n�mero do vetor A: ");
			for(int j=1;j<=a[i];j++){
				f = f*j;
			}
			b[i]=f;
			f=1;
				
		}
		System.out.println("\n\n0s n�meros correspondentes do vetor A" + ", por�m fatorados:");
		for (int i=0;i<15;i++){
			System.out.println("N� "+(i+i)+": "+b[i]);
		}
	}

}
