package br.com.opet.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataMain2 {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

		String data = "26/06/1999";

		d = sdf.parse(data);

		System.out.print(sdf.format(d));
	}
}