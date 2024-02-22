package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Los JavaBean requieren:
   - Un constructor sin parámetros o argumentos;
   - Sus propiedades han de tener sus métodos get y set
 */

public class JspCalendar {
    Calendar  calendar = null;

    public JspCalendar() {
	calendar = Calendar.getInstance();
	Date trialTime = new Date();
	calendar.setTime(trialTime);
    }

    public int getYear() {
	return calendar.get(Calendar.YEAR);
    }
    
    public String getMonth() {
	int m = getMonthInt();
	String[] months = new String [] { "January", "February", "March",
					"April", "May", "June",
					"July", "August", "September",
					"October", "November", "December" };
	if (m > 12)
	    return "Unknown to Man";
	
	return months[m - 1];

    }

    public String getDay() {
	int x = getDayOfWeek();
	String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", 
				      "Thursday", "Friday", "Saturday"};

	if (x > 7)
	    return "Unknown to Man";

	return days[x - 1];

    }
    
    public int getMonthInt() {
	return 1 + calendar.get(Calendar.MONTH);
    }

    public String getDate() {
	return getMonthInt() + "/" + getDayOfMonth() + "/" +  getYear();

    }

    public String getTime() {
	return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public int getDayOfMonth() {
	return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getDayOfYear() {
	return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int getWeekOfYear() {
	return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getWeekOfMonth() {
	return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public int getDayOfWeek() {
	return calendar.get(Calendar.DAY_OF_WEEK);
    }
     
    public int getHour() {
	return calendar.get(Calendar.HOUR_OF_DAY);
    }
    
    public int getMinute() {
	return calendar.get(Calendar.MINUTE);
    }


    public int getSecond() {
	return calendar.get(Calendar.SECOND);
    }

    public static void main(String args[]) {
	JspCalendar db = new JspCalendar();
	p("date: " + db.getDayOfMonth());
	p("year: " + db.getYear());
	p("month: " + db.getMonth());
	p("time: " + db.getTime());
	p("date: " + db.getDate());
	p("Day: " + db.getDay());
	p("DayOfYear: " + db.getDayOfYear());
	p("WeekOfYear: " + db.getWeekOfYear());
	p("era: " + db.getEra());
	p("ampm: " + db.getAMPM());
	p("DST: " + db.getDSTOffset());
	p("ZONE Offset: " + db.getZoneOffset());
	p("TIMEZONE: " + db.getUSTimeZone());
    }

    private static void p(String x) {
	System.out.println(x);
    }


    public int getEra() {
	return calendar.get(Calendar.ERA);
    }

    public String getUSTimeZone() {
	String[] zones = new String[] {"Hawaii", "Alaskan", "Pacific",
				       "Mountain", "Central", "Eastern"};
	
	return zones[10 + getZoneOffset()];
    }

    public int getZoneOffset() {
	return calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000);
    }


    public int getDSTOffset() {
	return calendar.get(Calendar.DST_OFFSET)/(60*60*1000);
    }

    
    public int getAMPM() {
	return calendar.get(Calendar.AM_PM);
    }
    
    public static String obtenerSignoZodiaco(String fechaStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = sdf.parse(fechaStr);
        int dia = fecha.getDate();
        int mes = fecha.getMonth() + 1; 
        
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }
    
    public static String obtenerEdad(String fechaStr) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date fechaNacimiento = sdf.parse(fechaStr);
    
    Calendar fechaNacimientoCal = Calendar.getInstance();
    fechaNacimientoCal.setTime(fechaNacimiento);
    
    Calendar fechaActual = Calendar.getInstance();
    
    int diferenciaAnios = fechaActual.get(Calendar.YEAR) - fechaNacimientoCal.get(Calendar.YEAR);
    
    if (fechaActual.get(Calendar.MONTH) < fechaNacimientoCal.get(Calendar.MONTH) ||
            (fechaActual.get(Calendar.MONTH) == fechaNacimientoCal.get(Calendar.MONTH) &&
                    fechaActual.get(Calendar.DAY_OF_MONTH) < fechaNacimientoCal.get(Calendar.DAY_OF_MONTH))) {
        diferenciaAnios--;
    }
    
    return Integer.toString(diferenciaAnios);
}
}

