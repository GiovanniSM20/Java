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
		System.out.println("A frase em letras maiúsculas: " + frasem);
		
		frase1 = frase1.toLowerCase();
		System.out.println("A frase em letras minúsculas: " + frase1);
		
		frase1 = frase.substring(10,18) ; 
		System.out.println("Conteúdo da frase entre as posições 10 e 18: " + frase1);
		
		frase1 = frase.substring(25);
		System.out.println("Conteúdo da frase a partir da posição 25: " + frase1);
		
		} catch (StringIndexOutOfBoundsException sloobe) {
			System.out.println("A frase digitada deve possuir mais de uma palavra e " + "mais de 25 letras");
			Teclado.lerTexto("Pressione uma tecla para continuar");
		}
	}

}
