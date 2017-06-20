package controller;
import util.Teclado;
public class Exercicios_10 {
	public static void main(String[] args){
		String e;
		e = Teclado.lerTexto("Digite a sigla de um estado do Brasil:");
		if (e.equals("RJ") || e.equals("SP") || e.equals("MG") || e.equals("ES")){
			System.out.println("O estado está no sudeste");
		}else{
			System.out.println("O estado não pertence a região sudeste");
			
				}
			}
		
	}


