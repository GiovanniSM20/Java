package controller;
import util.Teclado;
public class Exercicio_24 {
	public static void main(String[] args){
		int i, x;
		i = 0;
		do{
			x = Teclado.lerInt("Infome n�meros positivos: ");
			i = i + 1;
		}while(x > 0);
		i = i - 1;
		System.out.println("Foram informados " +i +" n�meros positivos");
	}

}
