package controller;

public class ExemploVetorString {
	public static void main(String[] args){
		String paises[] = new String[10];
		for (int i = 0; i < paises.length; i++){
			paises[i] = new String("Brasil");
		}
		paises[0] = "Japão";
		paises[2] = "Itália";
		paises[3] = "Argentina";
		paises[8] = "Peru";
		
		for (int i = 0; i < paises.length; i++) {
			System.out.println("paises[" + i + "] = "+ paises[i]);
		}
	}

}
