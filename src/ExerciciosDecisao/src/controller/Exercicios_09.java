package controller;
import util.Teclado;
public class Exercicios_09 {
	public static void main(String[] args){
		int D;
		D = Teclado.lerInt("Digite um número de 1 a 7:");
		if (D == 1){
			System.out.println("Domingo");
		}else{
			if (D == 2){
				System.out.println("Segunda-feira");
			}else{
				if (D == 3){
					System.out.println("Terceira-feira");
				}else{
					if (D == 4){
						System.out.println("Quarta-feira");
					}else{
						if (D == 5){
							System.out.println("Quinta-feira");
						}else{
							if (D == 6){
								System.out.println("Sexta-feira");
							}else{
								System.out.println("Sábado");
							}
						}
					}
				}
			}
		}
	}

}
