package Controller;

import Util.Teclado;

public class Q_01 {

	public static void main(String[] args) {
		try {
		String frase, frase1, frasem;
		frase = Teclado.lerTexto("Digite uma frase que seja importante na sua vida: ");
		
		frase1 = frase.substring(0,frase.indexOf (' '));
		System.out.println("Primeira palavra da frase: " + frase1 );
		
		frasem = frase.toUpperCase();
		System.out.println("A frase em letras mai�sculas: " + frasem);
		
		frase1 = frase1.toLowerCase();
		System.out.println("A frase em letras min�sculas: " + frase1);
		
		frase1 = frase.substring(10,18) ; 
		System.out.println("Conte�do da frase entre as posi��es 10 e 18: " + frase1);
		
		frase1 = frase.substring(25);
		System.out.println("Conte�do da frase a partir da posi��o 25: " + frase1);
		
		} catch (StringIndexOutOfBoundsException sloobe) {
			System.out.println("A frase digitada deve possuir mais de uma palavra e " + "mais de 25 letras");
			Teclado.lerTexto("Pressione uma tecla para continuar");
		}
	}

}
