package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateClassDemo {
	
	public static void main(String args[])
	{
		Date d= new Date();		
		System.out.println(d.toString());
		
		SimpleDateFormat sd= new SimpleDateFormat("M:D:yyyy");		
		System.out.println(sd.format(d));
		Calendar cal =Calendar.getInstance();
		sd.format(cal.getTime());
		System.out.println(sd.format(cal.getTime()));
		
		cal.get(Calendar.DATE);
		
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.ALL_STYLES));
	System.out.println(cal.get(Calendar.YEAR));
		
		
		
	}

}
