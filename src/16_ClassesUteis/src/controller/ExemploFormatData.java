package controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ExemploFormatData {
	public static void main(String[] args){
		Date data = new Date();
		System.out.println("Data "+ data);
		
		@Deprecated
		Date dataInserida = new Date(2011,9,14);
		System.out.println("Data inserida "+dataInserida);
		
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data: "+data2);
		data2.set(2011, 3 ,19);
		System.out.println("Mês: "+data2.get(Calendar.MONTH));
		
		System.out.println("Dia da Semana: "+ data2.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Dia do mês: "+data2.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia do Ano: "+data2.get(Calendar.DAY_OF_YEAR));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		
		Calendar data3 = new GregorianCalendar();
		data3.set(2010,8,25);
		System.out.println("Data 3 (FULL): "+df3.format(data3.getTime()));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
		Calendar data4 = new GregorianCalendar();
		data4.set(2010, 8, 25);
		System.out.println("Data 4 (LONG): "+df4.format(data4.getTime()));
		
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Calendar data5 = new GregorianCalendar();
		data5.set(2010, 8, 25);
		System.out.println("Data 5 (MEDIUM): "+df5.format(data5.getTime()));
		
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT);
		Calendar data6 = new GregorianCalendar();
		data6.set(2010,8,25);
		System.out.println("Data 6 (SHORT): "+ df6.format(data6.getTime()));
		
		TimeZone tz = TimeZone.getTimeZone("GMT-3:00");
		TimeZone.setDefault(tz);
		System.out.println(DateFormat.getTimeInstance().format(new Date()));
	}

}
