package Controller;

import Model.Mamifero;
import Model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		
		Reptil jacare = new Reptil ("Réptil", 4, "escamas","ovíparo","carnívoro",false);
		Reptil lagartixa = new Reptil ("Réptil", 4, "escamas", "ovíparo", "carnívoro", true);
		Mamifero cachorro = new Mamifero ("Mamífero", 4, "pelos", "vivíparo", "carnívoro","terrestre");
		Mamifero baleia = new Mamifero ("Mamífero", 0, "pele", "vivíparo", "carnívoro", "aquático");

		jacare.exibir();
		lagartixa.exibir();
		cachorro.exibir();
		baleia.exibir();
	}

}
