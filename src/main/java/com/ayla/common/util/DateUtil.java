package com.ayla.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateUtil {
	
	public static Date getCurrentDateInUTC() {
		  Date currentDate = new Date();
		  Calendar mbCal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
		        mbCal.setTimeInMillis(currentDate.getTime());
		        Calendar cal = Calendar.getInstance();
		        cal.set(Calendar.YEAR, mbCal.get(Calendar.YEAR));
		        cal.set(Calendar.MONTH, mbCal.get(Calendar.MONTH));
		        cal.set(Calendar.DAY_OF_MONTH, mbCal.get(Calendar.DAY_OF_MONTH));
		        cal.set(Calendar.HOUR_OF_DAY, mbCal.get(Calendar.HOUR_OF_DAY));
		        cal.set(Calendar.MINUTE, mbCal.get(Calendar.MINUTE));
		        cal.set(Calendar.SECOND, mbCal.get(Calendar.SECOND));
		        cal.set(Calendar.MILLISECOND, mbCal.get(Calendar.MILLISECOND));
		        return cal.getTime();
		    }
	
	public static void main(String[] args) {
		System.out.println(getCurrentDateInUTC());
	}
		
}
