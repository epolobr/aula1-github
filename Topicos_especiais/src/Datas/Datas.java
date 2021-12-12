package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println("Variavel Y1: " + y1);
		System.out.println("Variavel Y2: " + y2);
		
		System.out.println("Variavel SDF1/Y1: " + sdf1.format(y1));
		System.out.println("Variavel SDF2/Y2: " + sdf2.format(y2));
		
		Date x1 = new Date();
		System.out.println("X1 data atual: " + sdf2.format(x1));
		
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println("X2 data atual: " + sdf2.format(x2));

		Date x3 = new Date(0L);
		System.out.println("X3 data atual: " + sdf2.format(x3));

		Date x4 = new Date(1000L * 60L * 60L * 8L);
		System.out.println("X4 data atual: " + sdf2.format(x4));
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("y3 data atual: " + sdf2.format(y3));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("y3 data atual: " + sdf3.format(y3));
		
		System.out.println("y3 data atual: " + (y3));
		
	}

}
