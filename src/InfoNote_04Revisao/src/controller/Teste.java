package controller;

import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario				
			(1, "fab", "123", "Fabricio", "fab@email", "2222-3333");
		
		Usuario use2 = new Usuario				
				(2, "bia", "123", "Bianca", "bia@email", "2224-3334");
		
		
		
		use2.mostrar();

	}

}
