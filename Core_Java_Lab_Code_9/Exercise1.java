package Core_Java_Lab_Code_9;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TimerAss1 extends Thread{
	
	@Override
	public void run() {
		while(true) {
			
		try{
		  Date d=new Date();
		  System.out.println(d);
			Thread.sleep(10000);
			
		}
		catch(InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
}
public class Exercise1 {

	public static void main(String[]args) {
		
		ExecutorService ser=Executors.newSingleThreadExecutor();
		
		ser.execute(new TimerAss1());
	}
 }

