package ExerciciosSequencia;

import util.Teclado;

public class Exerc10 {

	public static void main(String[] args) {
		
		String estado = Teclado.lerTexto("Informe a sigla do estado:");
		
		if (estado.equals("RJ") || estado.equals("SP") ||
		estado.equals("MG") || estado.equals("ES")) {
		System.out.println("O estado encontra-se na Regi�o Sudeste");
		}else{
	System.out.println("O estado n�o se encontra na Regi�o Sudeste");
		}
	}

}
