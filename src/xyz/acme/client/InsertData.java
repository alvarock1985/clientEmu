package xyz.acme.client;

import java.sql.Connection;
import java.sql.Statement;

public class InsertData {
	
	DataBase db = new DataBase();
	public Statement stmt;
	
	public void insertData(){
		
		
		try{
			
			Connection con = db.connectToDb();
			stmt = con.createStatement();
			
			
			
		}
		catch(Exception e){
			
			
		}
		
		
		
		
		
	}

}
