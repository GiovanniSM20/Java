package Controller;

import Model.Mamifero;
import Model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
		
		Reptil jacare = new Reptil ("R�ptil", 4, "escamas","ov�paro","carn�voro",false);
		Reptil lagartixa = new Reptil ("R�ptil", 4, "escamas", "ov�paro", "carn�voro", true);
		Mamifero cachorro = new Mamifero ("Mam�fero", 4, "pelos", "viv�paro", "carn�voro","terrestre");
		Mamifero baleia = new Mamifero ("Mam�fero", 0, "pele", "viv�paro", "carn�voro", "aqu�tico");

		jacare.exibir();
		lagartixa.exibir();
		cachorro.exibir();
		baleia.exibir();
	}

}
