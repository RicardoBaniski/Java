package br.com.opet.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataMain {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

		System.out.print(sdf.format(d));
	}
}