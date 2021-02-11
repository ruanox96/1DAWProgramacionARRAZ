package capitulo06_Recursos.DateCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Ej2 {

	public static void main(String[] args) {

		Calendar ahoraEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		Calendar ahoraEnSidney = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		
		System.out.println("Hora en Roma: " + ahoraEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en Sidney: " + ahoraEnSidney.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("La diferencia horaria entre Roma y Sidney es de: " + (ahoraEnRoma.get(Calendar.HOUR_OF_DAY)-ahoraEnSidney.get(Calendar.HOUR_OF_DAY)) + " horas.");
	}

}
