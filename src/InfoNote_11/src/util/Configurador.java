package util;

import java.io.FileInputStream;
import java.util.Properties;

public class Configurador {
	
	private String idioma;
	private String região;
	private String arquivoAjuda;
	
	public Configurador() throws Exception{
		
	//Abre o Arquivo de Propriedades
		FileInputStream arq = new FileInputStream("config.ini");
		
		//Cria um Objeto para armazenar as propriedades
		Properties prop = new Properties();
		
		//Carrega o conteúdo do arquivo de propriedades
		prop.load(arq);
		
		//Fecha o arquivo de propriedades 
		arq.close();
		 // Carrega as respectivas propriedades e cada atributo
		idioma = prop.getProperty("idioma");
		região = prop.getProperty("região");
		arquivoAjuda = prop.getProperty("ajuda");
		
	}

	public String getIdioma() {
		return idioma;
	}

	public String getRegião() {
		return região;
	}

	public String getArquivoAjuda() {
		return arquivoAjuda;
	}

	

	
	
}
