package model;
import util.Teclado;
public class ForEach {
	public static void main(String[] args) {
		try{
		int[] numero = new int[5];
		int soma = 0;
		
		for(int cont = 0; cont < numero.length; cont++) {
			numero[cont] = Teclado.lerInt("Digite um nº inteiro:");
		}
		
		for(int cont : numero) {
			soma += cont;
		}
		
		System.out.println("A soma dos números que você digitou é "+soma);
	}catch(NumberFormatException nfe){
		System.out.println("Erro: Digite números inteiros");
		main(args);
	}
	}

}
