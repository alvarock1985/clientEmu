package xyz.acme.client;

import java.sql.Timestamp;

public class Time {
	
	public Timestamp getTime(){
		
		
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		return date;
		
	}

}
