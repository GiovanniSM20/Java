package controller;

import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {
	public static void main(String []args){
		Reptil jacare = new Reptil ("Jacar�: ", 4, "escamas", "Ov�paro", "Carn�voro", false );
		Reptil lagartixa = new Reptil ("Lagartixa: ", 4, "escamas", "Ov�paro", "Carn�voro", false);
		Mamifero cachorro = new Mamifero ("Cachorro: ", 4, "pelos", "viv�paro", "Carn�voro", "terrestre");
		Mamifero baleia = new Mamifero ("Baleia: ", 0, "pele", "viv�paro", "Carn�voro", "aqu�tico");
		
	}

}
