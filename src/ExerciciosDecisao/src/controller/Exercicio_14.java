package controller;
import util.Teclado;
public class Exercicio_14 {
	public static void main(String[] args){
		int i;
		i = Teclado.lerInt("Informe a sua idade:");
		if(i < 18){
			System.out.println("Você é menor de idade");
		}else{
			if(i > 65){
				System.out.println("Você é maior de 65 anos");
			}else{
				System.out.println("Você é maior de idade");
			}
		}
	}

}
