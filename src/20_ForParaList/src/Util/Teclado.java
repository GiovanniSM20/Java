package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	private static BufferedReader teclado = new BufferedReader(
			new InputStreamReader(System.in));

	public static String lerTexto(String texto) {
		try {
			System.out.println(texto);
			return teclado.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public static int lerInt(String texto) {
		return Integer.parseInt(lerTexto(texto));
	}

	public static double lerDouble(String texto) {
		return Double.parseDouble(lerTexto(texto));
	}
}