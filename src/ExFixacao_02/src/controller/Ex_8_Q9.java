package controller;
import util.Teclado;
public class Ex_8_Q9 {
	public static void main(String[] args){
		try{
			int a = Teclado.lerInt("Digite um número");
			System.out.println("O número digitado foi: "+a);
		} catch (NumberFormatException nfe){
			try{
				int a = Teclado.lerInt("Digite um número");
				System.out.println("O número digitado foi: "+a);
			} catch (NumberFormatException nfe1){
				try{
					int a = Teclado.lerInt("Digite um número");
					System.out.println("O número digitado foi: "+a);
			} catch(NumberFormatException nfe2){
				System.out.println("Excedeu o número de tentativas");
			}
				
			}
		}
	}

}
