	package controller;

public class ChamadaMetodos {
	public static void main(String[] args){
		System.out.println("Iniciando Programa");
		primeiro();
		System.out.println("Continuando Programa");
		terceiro();
		System.out.println("Terminando Programa");
	}

		public static void primeiro(){
			System.out.println("Iniciando o método 1");
			segundo();
			System.out.println("Terminando o método 1");
		}
		public static void segundo(){
			System.out.println("Iniciando o método 2");
			System.out.println("Terminado o método 2");
		}
		public static void terceiro(){
			System.out.println("Iniciando o método 3");
			System.out.println("Terminando o método 3");
		}
}
