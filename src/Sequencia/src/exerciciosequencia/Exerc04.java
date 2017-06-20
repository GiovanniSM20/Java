package exerciciosequencia;
import util.Teclado;
public class Exerc04 {
	public static void main(String[] args) {
		double valor , descont , result;
		valor = Teclado.lerDouble ("valor do prod: ");
		descont = Teclado.lerDouble ("valor do descont: ");
		result= valor / descont;
		System.out.println("o valor final do prod: " + result);
		
	}

}
