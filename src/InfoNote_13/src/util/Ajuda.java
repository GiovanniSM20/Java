package util;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ajuda {
	
	private String texto;
	
	public Ajuda (String nomeArquivo) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));
		
		String linha = "";
		
		do {
			
			linha = in.readLine();
			
			if (linha != null) {
				texto += linha + "\n";
			}
		} while (linha != null);
	}
	
	public String getTexto() {
		return texto;
	}

}
