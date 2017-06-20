package controller;

import model.Endereco;
import model.ItemDePedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		Usuario user = new Usuario(1, "joseph", "climber", 
				"Joseph Climber","josephclimber@gmail.com","2222-3344");
		
		Endereco end = new Endereco("Rua São Francisco Xavier", "417", 
				"APTO 509", "Tijuca", "Rio de Janeiro", "RJ", "20550-010" );
		
		Notebook n1 = new Notebook(101,"HP N1","CPU i3, 2GB, 320GB", 15, 
				1000.00,"C:\\imagens\\hpn1.jpg", "04/11/2014" );
		
		Notebook n2 = new Notebook(102, "HP N2", "CPU i5, 4GB, 500GB",
				6, 2000.00,"C:\\imagens\\hpn2.jpg", "04/11/2014" );
		
		Notebook n3 = new Notebook(103, "HP N3", "CPU i7, 8GB, 1TB",
				8, 3000.00, "C:\\imagens\\hpn3.jpg" , "04/11/2014" );
		
						
		//2 notebooks do obj n1
		ItemDePedido it1 = new ItemDePedido(2, 2000.00);//2 x 1000
		
		//1 notebook do obj n3
		ItemDePedido it2 = new ItemDePedido(1, 3000.00);
				
		//2000 do it1 + 3000 do it2
		Pedido p1 = new Pedido(3425245, "04/11/2014", "Cartão Visa 10x",
				5000.00, "Aguardando confirmação da operadora de cartões");
				
		System.out.println("Exibindo os objetos:");
		System.out.println();//pular linha
		
		
		//Mostrar Usuário
		user.mostrar();

		end.mostrar();
		
		n1.mostrar();
		n2.mostrar();
		n3.mostrar();
		
		it1.mostrar();
		it2.mostrar();
		
		p1.mostrar();
		
	}
}
