package lck02_J_NCEgetLO;

import java.text.DateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

class Base {
	static DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);
	
	public Date parse(String str) throws ParseException, java.text.ParseException { 
		synchronized (getClass()) {
			return format.parse(str); 
			}
	} 
}
