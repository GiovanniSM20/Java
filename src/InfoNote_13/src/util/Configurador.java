package util;

import java.io.FileInputStream;
import java.util.Properties;


public class Configurador {
		
		private String idioma;
		private String regiao;
		private String arquivoAjuda;
		
		public Configurador() throws Exception{
			
			FileInputStream arq = new FileInputStream("config.ini");
			
			Properties prop = new Properties ();
			
			prop.load(arq);
			
			arq.close();
			
			idioma = prop.getProperty("idioma");
			regiao = prop.getProperty("regiao");
			arquivoAjuda = prop.getProperty("ajuda");
		}
		
		public String getIdioma(){
			return idioma;
		}
		
		public String getRegiao(){
			return regiao;
		}
		
		public String getArquivoAjuda(){
			return arquivoAjuda;
		

	}

}
