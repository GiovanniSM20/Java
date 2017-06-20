package controller;
import java.util.Random;

public class ArrayBaralho {

	public static void main(String[] args) {

		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", 
				"9", "10",	"Valete", "Dama", "Rei" };
		String[] nipes = { "Espadas", "Paus", "Copas", "Ouros" };

		//Random é uma API de Java que realiza sorteios aleatórios
		Random r = new Random();

		/* r.nextInt(faces.length) faz um sorteio entre 0 e 12 
		(o último índice do vetor face)*/
		int indiceFace = r.nextInt(faces.length);
		//face recebe p conteúdo existente na posição sorteada do vetor		
		String face = faces[indiceFace];

		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];

		String carta = face + " " + nipe;
		System.out.println(carta);

	}
}
