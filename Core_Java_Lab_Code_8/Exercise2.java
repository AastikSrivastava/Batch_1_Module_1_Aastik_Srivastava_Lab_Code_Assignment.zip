package Core_Java_Lab_Code_8;

import java.util.Date;

class Ex2 implements Runnable{
	
	public void run() {
		
	while(true) {
	   	try {
	   		Date d=new Date();
	   		System.out.println(d);
	   		Thread.sleep(10000);	   	
	   		}catch(InterruptedException e) {
	   		e.printStackTrace();
	   	}
	  }
 }
}
public class Exercise2 {

	public static void main(String[]args) {
       Ex2 t=new Ex2();
       Thread tr=new Thread(t);
       tr.start();
	}
}
