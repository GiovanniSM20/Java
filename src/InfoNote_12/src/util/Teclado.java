package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {
	
	/**
	 * Objeto que representa o teclado
	 */
	private static BufferedReader teclado = new BufferedReader(
			new InputStreamReader(System.in));
	
	public static String lerTexto(String texto) {
		try{
			// Mostra o texto
			System.out.println(texto);
			
			// Lê a linha 
			return teclado.readLine();
		} catch (IOException e) {
			return null;
		}
	}
	
	public static int lerInt(String texto){
		// Chama o método lerString e converte o resultado
		// para inteiro
		return Integer.parseInt(lerTexto(texto));
	}
	
	public static double lerDouble(String texto){
		// Chama o método lerString e converte o resultado para double
		return Double.parseDouble(lerTexto(texto));
	}
	
}
