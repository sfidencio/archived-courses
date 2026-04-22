import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
	
	/**
     *  https://rainydays.com.br/qual-a-diferenca-entre-gmt-e-utc/
	 * @author  Sebastiao Fidencio
	 * @version 1.0
	 * @since 2022-04-19
	 */

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		sdf4.setTimeZone(TimeZone.getTimeZone("UTC"));
		
		Date y1 = sdf1.parse("25/02/2022");
		Date y2 = sdf2.parse("01/09/2022 18:25:01");
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date y3 = Date.from(Instant.parse("2022-04-19T15:42:01Z")); //ISO8601
		
		//convertendo milliseconds para hora. 34.400.000 corresponde a 9 horaas
		//Vai da um diferença de 3 horas a menos em razão do fuso horário do BRASIL.
		Date x4 = new Date(1000L * 60L * 60 * 9L); 
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(y3); //3 horas a menos, data no formato ISO
		
		//Horario Local
		System.out.println("Horario Local: " + sdf2.format(x2));
		

		//Horario GMT
		System.out.println("Horario GMT: " + sdf3.format(x2));
		
		//Horario UTC
		System.out.println("Horario UTC:" + sdf4.format(x2));
		
	}

}
