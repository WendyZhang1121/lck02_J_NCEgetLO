package lck02_J_NCEgetLO;

import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

class Derived extends Base {
	
	public Date doSomethingAndParse(String str) throws ParseException, java.text.ParseException {
		synchronized (Base.class) { // ...
			return format.parse(str); 
			}
	} 
	
}
