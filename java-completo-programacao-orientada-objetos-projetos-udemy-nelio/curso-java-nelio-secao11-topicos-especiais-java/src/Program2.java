import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program2 {

	/**
	 * https://rainydays.com.br/qual-a-diferenca-entre-gmt-e-utc/
	 * 
	 * @author  Sebastiao Fidencio
	 * @version 1.0
	 * @since 2022-04-19
	 */

	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf2.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date d = Date.from(Instant.parse("2022-04-10T15:17:07Z")); // Padrão ISO 8601 e classe Instant
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 11);
		d = cal.getTime();

		System.out.println("New hour: " + sdf1.format(d));

		// Get minutes of Hour
		System.out.println("Minute of Hour: " + cal.get(Calendar.MINUTE));
		// Get seconds of Hour
		System.out.println("Second of Hour: " + cal.get(Calendar.SECOND));
		// Get month of Hour - Moth start index in zero (0), so, add + 1 1
		System.out.println("Month of year: " + (1 + cal.get(Calendar.MONTH)));

	}

}
