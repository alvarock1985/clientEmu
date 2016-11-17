package xyz.acme.client;

import java.sql.Timestamp;

public class Time {
	
	public void getTime(){
		
		
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		System.out.println(date);
		
	}

}
