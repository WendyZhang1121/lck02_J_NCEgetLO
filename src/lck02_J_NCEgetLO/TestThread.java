package lck02_J_NCEgetLO;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class TestThread implements Runnable {

	public void run() {
		Derived test = new Derived();
		try {
			test.doSomethingAndParse("test");
		} catch (ParseException | java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}
