package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {
	public static void main(String []args){
		Reptil jacare = new Reptil ("Jacaré: ", 4, "escamas", "Ovíparo", "Carnívoro", false );
		Reptil lagartixa = new Reptil ("Lagartixa: ", 4, "escamas", "Ovíparo", "Carnívoro", false);
		Mamifero cachorro = new Mamifero ("Cachorro: ", 4, "pelos", "vivíparo", "Carnívoro", "terrestre");
		Mamifero baleia = new Mamifero ("Baleia: ", 0, "pele", "vivíparo", "Carnívoro", "aquático");
		
	}

}
