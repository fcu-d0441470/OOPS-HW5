package fcu.iecs.oops.hw5;

import java.util.Random;

public class GYM {

	public static void fight(Pokemon p1,Pokemon p2){
		
	     Random ran = new Random();
	        System.out.println(ran.nextInt(2)+1);
	        int temp = ran.nextInt(2)+1;
	        if(temp == 1){
	        	System.out.println("Winner is ["+ p1.getName()+"]");
	        	p1.setCp(500);
	        }
	        else
	        {
	        	System.out.println("Winner is ["+ p2.getName()+"]");
	        	p2.setCp(500);
	        }
	}
	
}
